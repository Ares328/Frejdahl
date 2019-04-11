package ui.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/VikingBeer")
public class VikingBeer extends HttpServlet {
    int amount = 3;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher(questions(request,response)).forward(request,response);
    }

    protected String questions(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = request.getParameter("Value");
        int valueint = 0;
        System.out.println(value);
        if (value != null){
            valueint = Integer.parseInt(value);
        }

        //TODO The values that are selected need to be filled in to match beers

        switch(valueint){
            case 1 :

                break;
            case 2 :

        }
        return random(request,response);
    }

    protected String random(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int guess = 1 + (int)(Math.random() * ((3 - 1) + 1));
        //TODO Get to result!! by adding a value that goes down to 0
        if (amount == 0){
            guess = 0;
        }
        amount--;
        if (guess == 1){
            return "first.jsp";
        }else if(guess == 2){
            return "second.jsp";
        }else if(guess == 3){
            return "index.jsp";
        }else {
            amount = 3;
            return "result.jsp";
        }
    }
}
