package domin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiCode<T> {

    private Integer code;

    private String description;

    private Integer port;

    private T result;

    public ApiCode(Integer code, T result) {
        this.code = code;
        this.result = result;
    }
    public ApiCode(Integer code, Integer port , T result) {
        this.port = port;
        this.code = code;
        this.result = result;
    }

}
