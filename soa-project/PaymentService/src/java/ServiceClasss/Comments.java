package ServiceClasss;

public class Comments {

	/**
	 * Instance fields are declared as specified.
	 * These fields are hidden from other classes as all the fields are declared private.
	 * These fields can be accessed through Getters and Setters. 	
	 */
		private String commentID;
		private String commentTime;
		private String commentDate;
		private String commentType;
		public String getCommentID() {
			return commentID;
		}
		public void setCommentID(String commentID) {
			this.commentID = commentID;
		}
		public String getCommentTime() {
			return commentTime;
		}
		public void setCommentTime(String commentTime) {
			this.commentTime = commentTime;
		}
		public String getCommentDate() {
			return commentDate;
		}
		public void setCommentDate(String commentDate) {
			this.commentDate = commentDate;
		}
		public String getCommentType() {
			return commentType;
		}
		public void setCommentType(String commentType) {
			this.commentType = commentType;
		}
	

}
