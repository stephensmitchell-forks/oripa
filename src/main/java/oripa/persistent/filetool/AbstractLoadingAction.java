package oripa.persistent.filetool;

import java.io.IOException;

import oripa.persistent.doc.WrongDataFormatException;

public abstract class AbstractLoadingAction<Data> {
	private String path;

	public final AbstractLoadingAction<Data> setPath(final String path) {
		this.path = path;
		return this;
	}

	public final String getPath() {
		return path;
	}

	public abstract Data load() throws FileVersionError, IOException, WrongDataFormatException;

}