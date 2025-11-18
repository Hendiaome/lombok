import java.util.Map;
import java.util.HashMap;

class SetterWithTrackSource {
	private Map<String, String> sourceMap = new HashMap<String, String>();
	private String title;
	private int count;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public void setTitle(final String title, final String source) {
		this.title = title;
		this.sourceMap.put("title", source);
	}
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public void setCount(final int count, final String source) {
		this.count = count;
		this.sourceMap.put("count", source);
	}
}
