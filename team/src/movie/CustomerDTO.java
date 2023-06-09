package movie;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@AllArgsConstructor
@ToString
public class CustomerDTO {
	int custNo;
	String custName;
	String custPhone;
	int custPoint;
}
