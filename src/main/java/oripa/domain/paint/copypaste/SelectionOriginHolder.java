package oripa.domain.paint.copypaste;

import javax.vecmath.Vector2d;

import oripa.domain.paint.PaintContextInterface;

public class SelectionOriginHolder {

	public SelectionOriginHolder() {
	}

	private Vector2d origin = null;

	public void setOrigin(final Vector2d p) {
		origin = p;
	}

	public void resetOrigin(final PaintContextInterface context) {
		if (origin == null) {
			if (context.getLineCount() > 0) {
				origin = context.getLine(0).p0;
			}
		}
	}

	public Vector2d getOrigin(final PaintContextInterface context) {
		resetOrigin(context);

		return origin;
	}

}
