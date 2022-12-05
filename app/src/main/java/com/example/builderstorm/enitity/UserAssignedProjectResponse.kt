package com.example.builderstorm.enitity

import com.google.gson.annotations.SerializedName

data class UserAssignedProjectResponse(

    @field:SerializedName("data")
    val data: Data? = null,

    @field:SerializedName("success")
    val success: Boolean? = null,

    @field:SerializedName("authToken")
    val authToken: String? = null,

    @field:SerializedName("datalimit")
    val datalimit: Any? = null,

    @field:SerializedName("message")
    val message: String? = null
)

data class CostCodesItem(

    @field:SerializedName("is_category")
    val isCategory: String? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("cost_code")
    val costCode: String? = null
)

data class Data(

    @field:SerializedName("user_projects")
    val userProjects: List<UserProjectsItem?>? = null
)

data class ProjectHours(

    @field:SerializedName("start_time")
    val startTime: String? = null,

    @field:SerializedName("visible")
    val visible: String? = null,

    @field:SerializedName("date_updated")
    val dateUpdated: String? = null,

    @field:SerializedName("project_id")
    val projectId: Int? = null,

    @field:SerializedName("end_time")
    val endTime: String? = null,

    @field:SerializedName("project_day")
    val projectDay: String? = null,

    @field:SerializedName("id")
    val id: Int? = null
)

data class UserProjectsItem(

    @field:SerializedName("submittal_on_off")
    val submittalOnOff: Int? = null,

    @field:SerializedName("document_controllers")
    val documentControllers: String? = null,

    @field:SerializedName("costCodes")
    val costCodes: List<Any?>? = null,

    @field:SerializedName("server_address")
    val serverAddress: String? = null,

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("plant_manager")
    val plantManager: String? = null,

    @field:SerializedName("project_order_no")
    val projectOrderNo: String? = null,

    @field:SerializedName("password")
    val password: String? = null,

    @field:SerializedName("project_id")
    val projectId: String? = null,

    @field:SerializedName("contact")
    val contact: String? = null,

    @field:SerializedName("drawing_revision_sequence_button")
    val drawingRevisionSequenceButton: Int? = null,

    @field:SerializedName("lat")
    val lat: String? = null,

    @field:SerializedName("c_manager")
    val cManager: String? = null,

    @field:SerializedName("color_code")
    val colorCode: String? = null,

    @field:SerializedName("zip")
    val zip: String? = null,

    @field:SerializedName("collection_uid")
    val collectionUid: Int? = null,

    @field:SerializedName("image")
    val image: String? = null,

    @field:SerializedName("retention_date")
    val retentionDate: String? = null,

    @field:SerializedName("submittal_days_warning")
    val submittalDaysWarning: String? = null,

    @field:SerializedName("retention_notify_days")
    val retentionNotifyDays: Int? = null,

    @field:SerializedName("archive")
    val archive: Int? = null,

    @field:SerializedName("showfor_mobile_siteaccess")
    val showforMobileSiteaccess: String? = null,

    @field:SerializedName("db_importor_status")
    val dbImportorStatus: Int? = null,

    @field:SerializedName("submittal_status_graph")
    val submittalStatusGraph: Int? = null,

    @field:SerializedName("submittal_days_warning_button")
    val submittalDaysWarningButton: Int? = null,

    @field:SerializedName("hidden_status")
    val hiddenStatus: Int? = null,

    @field:SerializedName("region")
    val region: String? = null,

    @field:SerializedName("status")
    val status: String? = null,

    @field:SerializedName("end_date")
    val endDate: String? = null,

    @field:SerializedName("note")
    val note: String? = null,

    @field:SerializedName("description")
    val description: String? = null,

    @field:SerializedName("project_cost")
    val projectCost: String? = null,

    @field:SerializedName("drawing_revision_sequence")
    val drawingRevisionSequence: String? = null,

    @field:SerializedName("title")
    val title: String? = null,

    @field:SerializedName("logistics_manager")
    val logisticsManager: String? = null,

    @field:SerializedName("projectHours")
    val projectHours: ProjectHours? = null,

    @field:SerializedName("super_admin_project")
    val superAdminProject: Int? = null,

    @field:SerializedName("project_primaryEmail")
    val projectPrimaryEmail: String? = null,

    @field:SerializedName("uid")
    val uid: Int? = null,

    @field:SerializedName("added_by")
    val addedBy: Int? = null,

    @field:SerializedName("delete_status")
    val deleteStatus: Int? = null,

    @field:SerializedName("client")
    val client: Int? = null,

    @field:SerializedName("submittal_revision_sequence_button")
    val submittalRevisionSequenceButton: Int? = null,

    @field:SerializedName("submittals_upload_project_document")
    val submittalsUploadProjectDocument: String? = null,

    @field:SerializedName("noOfMilestonesToShow")
    val noOfMilestonesToShow: Int? = null,

    @field:SerializedName("cost_track_labour")
    val costTrackLabour: Boolean? = null,

    @field:SerializedName("lang")
    val lang: String? = null,

    @field:SerializedName("added_on")
    val addedOn: String? = null,

    @field:SerializedName("headline")
    val headline: String? = null,

    @field:SerializedName("submittal_revision_sequence")
    val submittalRevisionSequence: String? = null,

    @field:SerializedName("address")
    val address: String? = null,

    @field:SerializedName("proj_doc_flow_manager")
    val projDocFlowManager: String? = null,

    @field:SerializedName("stage")
    val stage: String? = null,

    @field:SerializedName("submittals_upload_project_drawing")
    val submittalsUploadProjectDrawing: String? = null,

    @field:SerializedName("group_id_system")
    val groupIdSystem: Int? = null,

    @field:SerializedName("project_order")
    val projectOrder: Int? = null,

    @field:SerializedName("username")
    val username: String? = null
)
