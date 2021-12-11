package by.bsuir.yaskevich.controller.command.user;

import by.bsuir.yaskevich.controller.command.Command;
import by.bsuir.yaskevich.controller.command.CommandResult;
import by.bsuir.yaskevich.exception.ServiceException;
import by.bsuir.yaskevich.service.RoomService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MakeOrderCommand implements Command {

    private static final String MAIN_PAGE = "controller?command=mainPage";
    private static final String ROOM_ID = "roomId";

    @Override
    public CommandResult execute(HttpServletRequest request, HttpServletResponse response) throws ServiceException {
        String roomId = request.getParameter(ROOM_ID);

        RoomService roomService = new RoomService();
        roomService.changeStatus(Integer.valueOf(roomId), true);

        return CommandResult.redirect(MAIN_PAGE);
    }
}
