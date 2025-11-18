import lombok.Setter;
import java.util.Map;
import java.util.HashMap;

class SetterWithTrackSource {
	private Map<String, String> sourceMap = new HashMap<String, String>();
	
	@Setter(trackSource = true)
	private String title;
	
	@Setter(trackSource = true)
	private int count;
}
