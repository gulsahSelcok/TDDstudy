import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.*;

public class StackOperationsTest {


    @Test
    public void should_return_one_when_add_data_into_stack(){
        //Arrange
        StackOperations stack = new StackOperations();
        //Act
        int result = stack.add(3);
        //Assert
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void should_increase_stack_size_when_remove_data_from_stack(){
        //Arrange
        StackOperations stack = new StackOperations();
        int stacksize_before_remove = 0;
        int stacksize_after_remove = 0;
        //Act
        stack.add(0);
        stacksize_before_remove = stack.length();
        stack.remove();
        stacksize_after_remove = stack.length();
        //Assert
        assertThat(stacksize_after_remove).isEqualTo(stacksize_before_remove-1);
    }

    @Test
    public void should_return_last_data_when_peek(){
        //Arrange
        StackOperations stack = new StackOperations();
        stack.add(5);
        //Act
        int result = stack.getData();
        //Assert
        assertThat(result).isEqualTo(5);
    }

}
