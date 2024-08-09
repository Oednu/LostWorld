package net.oednu.lostworld.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.phys.BlockHitResult;

public class LockingDoorBlock extends DoorBlock {

    public static final BooleanProperty LOCKED = BooleanProperty.create("locked");
    public LockingDoorBlock(Properties properties) {
        super((BlockBehaviour.Properties.of().sound(SoundType.NETHERITE_BLOCK).strength(-1).noOcclusion().explosionResistance(1000000).mapColor(MapColor.NONE)), BlockSetType.IRON);
        this.registerDefaultState(this.stateDefinition.any().setValue(LOCKED, true).setValue(OPEN, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(LOCKED); // Add the LOCKED property
    }
    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack heldItem = player.getItemInHand(hand);

        // Check if the player is holding the key item
        if (heldItem.getItem() instanceof KeyItem) {
            if (state.getValue(LOCKED)) {
                // Unlock the door
                world.setBlock(pos, state.setValue(LOCKED, false), 3);
                if (!player.isCreative()) {
                    heldItem.shrink(1); // Consume the key
                }
                world.playSound(null, pos, SoundEvents.IRON_TRAPDOOR_OPEN, SoundSource.BLOCKS, 1.0F, 1.0F);
                return InteractionResult.SUCCESS;
            }
        }

        // Handle door state toggling if unlocked
        if (!state.getValue(LOCKED)) {
            boolean isOpen = state.getValue(OPEN);
            world.setBlock(pos, state.setValue(OPEN, !isOpen), 3);
            world.playSound(null, pos, isOpen ? SoundEvents.IRON_DOOR_CLOSE : SoundEvents.IRON_DOOR_OPEN, SoundSource.BLOCKS, 1.0F, 1.0F);
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }

    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        // Do nothing to prevent the door from reacting to Redstone signals
    }
    @Override
    public int getSignal(BlockState blockState, BlockGetter blockAccess, BlockPos pos, Direction side) {
        return 0;
    }

    @Override
    public int getDirectSignal(BlockState state, BlockGetter world, BlockPos pos, Direction direction) {
        return 0;
    }
}