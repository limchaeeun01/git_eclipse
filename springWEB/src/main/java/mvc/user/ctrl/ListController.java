package mvc.user.ctrl;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.user.domain.UserResponseDTO;
import mvc.util.Controller;
import mvc.util.View;

public class ListController implements Controller {

    @Override
    public View execute(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("debug >>> ListController execute");
        
        // 리스트에 데이터를 추가합니다.
        List<UserResponseDTO> list = new ArrayList<UserResponseDTO>();
        list.add(new UserResponseDTO("lim", "lim", "채니"));
        list.add(new UserResponseDTO("kim", "kim", "민수"));
        list.add(new UserResponseDTO("park", "park", "지훈"));
                
        // 리스트를 request에 설정합니다.
        request.setAttribute("lst", list);

        View view = new View();
        view.setResponseJSP("list.jsp");
        view.setFlag(true);
        
        return view;
    }
}
