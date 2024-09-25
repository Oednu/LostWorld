package net.oednu.lostworld.custom;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ConnectedBlock extends Block {

    // Define block state properties for connections on each side
    public static final BooleanProperty NORTH = BooleanProperty.create("north");
    public static final BooleanProperty SOUTH = BooleanProperty.create("south");
    public static final BooleanProperty EAST = BooleanProperty.create("east");
    public static final BooleanProperty WEST = BooleanProperty.create("west");
    public static final BooleanProperty UP = BooleanProperty.create("up");
    public static final BooleanProperty DOWN = BooleanProperty.create("down");

    public ConnectedBlock(Properties properties) {
        super(properties);
        // Set the default state of the block
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(NORTH, false)
                .setValue(SOUTH, false)
                .setValue(EAST, false)
                .setValue(WEST, false)
                .setValue(UP, false)
                .setValue(DOWN, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        // Add the properties to the block state definition
        builder.add(NORTH, SOUTH, EAST, WEST, UP, DOWN);
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
        // Update the block state whenever the shape of the block changes (neighboring blocks change)
        return this.updateState(state, world, currentPos);
    }

    private BlockState updateState(BlockState state, LevelAccessor world, BlockPos pos) {
        // Check if neighboring blocks are the same as this block, and update the state accordingly
        boolean north = world.getBlockState(pos.north()).getBlock() == this;
        boolean south = world.getBlockState(pos.south()).getBlock() == this;
        boolean east = world.getBlockState(pos.east()).getBlock() == this;
        boolean west = world.getBlockState(pos.west()).getBlock() == this;
        boolean up = world.getBlockState(pos.above()).getBlock() == this;
        boolean down = world.getBlockState(pos.below()).getBlock() == this;

        // Return the updated state with the correct connections
        return state.setValue(NORTH, north)
                .setValue(SOUTH, south)
                .setValue(EAST, east)
                .setValue(WEST, west)
                .setValue(UP, up)
                .setValue(DOWN, down);
    }

    @Override
    public void neighborChanged(BlockState state, Level world, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
        // Trigger state update when a neighboring block changes
        world.setBlock(pos, updateState(state, world, pos), 2);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        // Example: Update the block's shape based on connections
        VoxelShape shape = Shapes.block();
        if (state.getValue(NORTH)) {
            shape = Shapes.or(shape, Shapes.box(0, 0, 0, 1, 1, 0.25));
        }
        if (state.getValue(SOUTH)) {
            shape = Shapes.or(shape, Shapes.box(0, 0, 0.75, 1, 1, 1));
        }
        if (state.getValue(EAST)) {
            shape = Shapes.or(shape, Shapes.box(0.75, 0, 0, 1, 1, 1));
        }
        if (state.getValue(WEST)) {
            shape = Shapes.or(shape, Shapes.box(0, 0, 0, 0.25, 1, 1));
        }
        if (state.getValue(UP)) {
            shape = Shapes.or(shape, Shapes.box(0, 0.75, 0, 1, 1, 1));
        }
        if (state.getValue(DOWN)) {
            shape = Shapes.or(shape, Shapes.box(0, 0, 0, 1, 0.25, 1));
        }
        return shape;
    }
}