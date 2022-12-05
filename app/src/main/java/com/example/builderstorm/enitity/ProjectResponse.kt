package com.example.builderstorm.enitity

import com.google.gson.annotations.SerializedName

data class ProjectResponse(

    @field:SerializedName("isStagedDocument")
    val isStagedDocument: Boolean? = null,

    @field:SerializedName("data")
    val data: List<DataItem?>? = null,

    @field:SerializedName("success")
    val success: Boolean? = null,

    @field:SerializedName("authToken")
    val authToken: String? = null,

    @field:SerializedName("datalimit")
    val datalimit: Any? = null,

    @field:SerializedName("dataHeader")
    val dataHeader: DataHeader? = null,

    @field:SerializedName("message")
    val message: String? = null,

    @field:SerializedName("overdueDates")
    val overdueDates: List<Any?>? = null
)

data class DataItem(

    @field:SerializedName("rowcolumns")
    val rowcolumns: List<RowcolumnsItem?>? = null,

    @field:SerializedName("rowdata")
    val rowdata: Rowdata? = null
)

data class RowcolumnsItem(

    @field:SerializedName("column_data")
    val columnData: ColumnData? = null,

    @field:SerializedName("col_id")
    val colId: String? = null,

    @field:SerializedName("old_col_id")
    val oldColId: Any? = null,

    @field:SerializedName("field_display_report_order")
    val fieldDisplayReportOrder: Any? = null,

    @field:SerializedName("old_parent_column_id")
    val oldParentColumnId: Any? = null,

    @field:SerializedName("is_filter_field")
    val isFilterField: String? = null,

    @field:SerializedName("isEditableColumn")
    val isEditableColumn: Boolean? = null,

    @field:SerializedName("is_report_column")
    val isReportColumn: String? = null,

    @field:SerializedName("prt_col_id")
    val prtColId: String? = null,

    @field:SerializedName("parent_column")
    val parentColumn: Any? = null,

    @field:SerializedName("template_id")
    val templateId: String? = null,

    @field:SerializedName("id")
    val id: String? = null,

    @field:SerializedName("row_id")
    val rowId: String? = null,

    @field:SerializedName("editableClass")
    val editableClass: String? = null
)

data class Rowdata(

    @field:SerializedName("old_row_id")
    val oldRowId: Int? = null,

    @field:SerializedName("row_order")
    val rowOrder: Int? = null,

    @field:SerializedName("stage_id")
    val stageId: Int? = null,

    @field:SerializedName("old_stage_id")
    val oldStageId: Int? = null,

    @field:SerializedName("index")
    val index: Int? = null,

    @field:SerializedName("is_repeat_data")
    val isRepeatData: Boolean? = null,

    @field:SerializedName("added_by")
    val addedBy: Int? = null,

    @field:SerializedName("template_id")
    val templateId: Int? = null,

    @field:SerializedName("id")
    val id: Int? = null,

    @field:SerializedName("page")
    val page: Int? = null,

    @field:SerializedName("repeat_status")
    val repeatStatus: Int? = null,

    @field:SerializedName("added_on")
    val addedOn: String? = null,

    @field:SerializedName("isEditableRow")
    val isEditableRow: Boolean? = null
)

data class DataHeader(

    @field:SerializedName("template_footer")
    val templateFooter: String? = null,

    @field:SerializedName("template_header")
    val templateHeader: String? = null
)

data class ColumnData(

    @field:SerializedName("control_width")
    val controlWidth: String? = null,

    @field:SerializedName("label_pos")
    val labelPos: String? = null,

    @field:SerializedName("maximum_length_val")
    val maximumLengthVal: String? = null,

    @field:SerializedName("is_required")
    val isRequired: Int? = null,

    @field:SerializedName("minimum_length_val")
    val minimumLengthVal: String? = null,

    @field:SerializedName("options")
    val options: List<Any?>? = null,

    @field:SerializedName("result_label")
    val resultLabel: String? = null,

    @field:SerializedName("label")
    val label: String? = null,

    @field:SerializedName("label_2")
    val label2: String? = null,

    @field:SerializedName("type")
    val type: String? = null,

    @field:SerializedName("label_width")
    val labelWidth: String? = null,

    @field:SerializedName("value")
    val value: String? = null,

    @field:SerializedName("add_from_bs")
    val addFromBs: List<Any?>? = null
)
