package view;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {


    @Test
    @DisplayName("문자열이 들어올 경우 InputMismatchException 반환")
    public void noString() throws Exception{
        //given
        InputStream inputStream = new ByteArrayInputStream("sss".getBytes());
        System.setIn(inputStream);
        Scanner sc = new Scanner(System.in);
        ByteOutputStream bos = new ByteOutputStream();

        //when


        //then
    }

    @Test
    @DisplayName("0을 포함한 음수가 들어올 경우 IllegalArgumentException 반환")
    public void noNegativeAndZero() throws Exception{
        //given

        //when

        //then
    }


}