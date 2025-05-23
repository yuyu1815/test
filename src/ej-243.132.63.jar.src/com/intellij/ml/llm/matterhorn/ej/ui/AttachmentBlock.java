/*     */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.ide.BrowserUtil;
/*     */ import com.intellij.ui.dsl.builder.Cell;
/*     */ import com.intellij.ui.dsl.builder.MutablePropertyKt;
/*     */ import com.intellij.ui.dsl.builder.Panel;
/*     */ import com.intellij.ui.dsl.builder.Row;
/*     */ import com.intellij.ui.dsl.builder.TextFieldKt;
/*     */ import feedback.FeedbackBlock;
/*     */ import feedback.JsonDataProvider;
/*     */ import feedback.TextDescriptionProvider;
/*     */ import java.awt.event.ActionEvent;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.json.JsonElement;
/*     */ import kotlinx.serialization.json.JsonElementKt;
/*     */ import kotlinx.serialization.json.JsonObjectBuilder;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\007\030\0002\0020\0012\0020\0022\0020\003B\007¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\020\020\f\032\0020\t2\006\020\r\032\0020\016H\026J\024\020\017\032\0020\t2\n\020\020\032\0060\021j\002`\022H\026R\020\020\006\032\004\030\0010\007X\016¢\006\002\n\000¨\006\023"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/AttachmentBlock;", "Lfeedback/FeedbackBlock;", "Lfeedback/JsonDataProvider;", "Lfeedback/TextDescriptionProvider;", "<init>", "()V", "uploadId", "", "addToPanel", "", "panel", "Lcom/intellij/ui/dsl/builder/Panel;", "collectBlockDataToJson", "jsonObjectBuilder", "Lkotlinx/serialization/json/JsonObjectBuilder;", "collectBlockTextDescription", "stringBuilder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "ej-ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ public final class AttachmentBlock
/*     */   implements FeedbackBlock, JsonDataProvider, TextDescriptionProvider
/*     */ {
/*     */   @Nullable
/*     */   private String uploadId;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   private static final Unit addToPanel$lambda$1(Row $this$row) {
/*     */     Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */     $this$row.label("Attach files:");
/*     */     $this$row.link("Upload service", AttachmentBlock::addToPanel$lambda$1$lambda$0);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit addToPanel$lambda$1$lambda$0(ActionEvent it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     BrowserUtil.browse("https://uploads.jetbrains.com/");
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   public void addToPanel(@NotNull Panel panel) {
/* 126 */     Intrinsics.checkNotNullParameter(panel, "panel"); Panel.row$default(panel, null, AttachmentBlock::addToPanel$lambda$1, 1, null);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 132 */     Panel.row$default(panel, null, this::addToPanel$lambda$4, 1, null); }
/* 133 */   private static final String addToPanel$lambda$4$lambda$2(AttachmentBlock this$0) { if (this$0.uploadId == null); return ""; } private static final Unit addToPanel$lambda$4(AttachmentBlock this$0, Row $this$row) { Intrinsics.checkNotNullParameter($this$row, "$this$row");
/*     */     
/* 135 */     TextFieldKt.bindText(Cell.label$default($this$row.textField(), "Upload ID:", null, 2, null), MutablePropertyKt.MutableProperty(this$0::addToPanel$lambda$4$lambda$2, this$0::addToPanel$lambda$4$lambda$3));
/* 136 */     return Unit.INSTANCE; }
/*     */ 
/*     */   
/*     */   public void collectBlockDataToJson(@NotNull JsonObjectBuilder jsonObjectBuilder) {
/* 140 */     Intrinsics.checkNotNullParameter(jsonObjectBuilder, "jsonObjectBuilder"); if (this.uploadId == null)
/* 141 */       jsonObjectBuilder.put("uploadId", (JsonElement)JsonElementKt.JsonPrimitive(this.uploadId));  } private static final Unit addToPanel$lambda$4$lambda$3(AttachmentBlock this$0, String it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     this$0.uploadId = it;
/*     */     return Unit.INSTANCE;
/*     */   } public void collectBlockTextDescription(@NotNull StringBuilder stringBuilder) {
/* 146 */     Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder"); if (this.uploadId != null) {
/* 147 */       Intrinsics.checkNotNullExpressionValue(stringBuilder.append("Upload ID: " + this.uploadId), "append(...)"); Intrinsics.checkNotNullExpressionValue(stringBuilder.append("Upload ID: " + this.uploadId).append('\n'), "append(...)"); stringBuilder.append("Upload ID: " + this.uploadId).append('\n');
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\AttachmentBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */