package com.pkslearning.support_service.dto;

import java.time.LocalDateTime;

public class TicketResponseDto {

	 private long ticketNumber;
	    private long customerId;
	    private String subject;
	    private String description;
	    private String category;
	    private String priority;
	    private String status;
	    private String assignedAgentId;
	    private LocalDateTime createdDate;
	    private LocalDateTime updatedDate;
		public long getTicketNumber() {
			return ticketNumber;
		}
		public void setTicketNumber(long ticketNumber) {
			this.ticketNumber = ticketNumber;
		}
		public long getCustomerId() {
			return customerId;
		}
		public void setCustomerId(long customerId) {
			this.customerId = customerId;
		}
		public String getSubject() {
			return subject;
		}
		public void setSubject(String subject) {
			this.subject = subject;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getPriority() {
			return priority;
		}
		public void setPriority(String priority) {
			this.priority = priority;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getAssignedAgentId() {
			return assignedAgentId;
		}
		public void setAssignedAgentId(String assignedAgentId) {
			this.assignedAgentId = assignedAgentId;
		}
		public LocalDateTime getCreatedDate() {
			return createdDate;
		}
		public void setCreatedDate(LocalDateTime createdDate) {
			this.createdDate = createdDate;
		}
		public LocalDateTime getUpdatedDate() {
			return updatedDate;
		}
		public void setUpdatedDate(LocalDateTime updatedDate) {
			this.updatedDate = updatedDate;
		}
		@Override
		public String toString() {
			return "TicketResponseDto [ticketNumber=" + ticketNumber + ", customerId=" + customerId + ", subject="
					+ subject + ", description=" + description + ", category=" + category + ", priority=" + priority
					+ ", status=" + status + ", assignedAgentId=" + assignedAgentId + ", createdDate=" + createdDate
					+ ", updatedDate=" + updatedDate + "]";
		}


}
