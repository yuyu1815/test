/*    */ package ai.grazie.model.task.library.code;
/*    */ 
/*    */ import ai.grazie.model.task.exec.TaskParameters;
/*    */ import ai.grazie.utils.attributes.Attributes;
/*    */ import ai.grazie.utils.attributes.AttributesBuilder;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated(message = "Use schema with task builder")
/*    */ @Serializable(with = TaskParameters.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\013\b\007\030\000 \0242\0020\001:\001\024B-\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\n\b\002\020\005\032\004\030\0010\006\022\n\b\002\020\007\032\004\030\0010\003¢\006\002\020\bR\024\020\t\032\0020\nX\004¢\006\b\n\000\032\004\b\013\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016R\023\020\007\032\004\030\0010\003¢\006\b\n\000\032\004\b\017\020\016R\025\020\005\032\004\030\0010\006¢\006\n\n\002\020\022\032\004\b\020\020\021R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\023\020\016¨\006\025"}, d2 = {"Lai/grazie/model/task/library/code/CodeGenerateCommitMessageTask$LLM$IJ$Slow$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "diff", "", "text", "summaryLength", "", "instruction", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getDiff", "()Ljava/lang/String;", "getInstruction", "getSummaryLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getText", "Companion", "model-task"})
/*    */ public final class Params
/*    */   extends TaskParameters
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String diff;
/*    */   @NotNull
/*    */   private final String text;
/*    */   @Nullable
/*    */   private final Integer summaryLength;
/*    */   @Nullable
/*    */   private final String instruction;
/*    */   @NotNull
/*    */   private final Attributes attributes;
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/code/CodeGenerateCommitMessageTask$LLM$IJ$Slow$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/code/CodeGenerateCommitMessageTask$LLM$IJ$Slow$Params;", "model-task"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<CodeGenerateCommitMessageTask.LLM.IJ.Slow.Params> serializer() {
/* 54 */       return (KSerializer<CodeGenerateCommitMessageTask.LLM.IJ.Slow.Params>)TaskParameters.Serializer.INSTANCE;
/*    */     }
/* 56 */   } @NotNull public final String getDiff() { return this.diff; } @NotNull public final String getText() { return this.text; } public Params(@NotNull String diff, @NotNull String text, @Nullable Integer summaryLength, @Nullable String instruction) { this.diff = diff; this.text = text; this.summaryLength = summaryLength; this.instruction = instruction;
/* 57 */     this.attributes = Attributes.Companion.build(new CodeGenerateCommitMessageTask$LLM$IJ$Slow$Params$attributes$1()); } @Nullable public final Integer getSummaryLength() { return this.summaryLength; } @Nullable public final String getInstruction() { return this.instruction; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/* 58 */   static final class CodeGenerateCommitMessageTask$LLM$IJ$Slow$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text(CodeGenerateCommitMessageTask.LLM.IJ.Slow.Schema.INSTANCE.getDiff().getName(), CodeGenerateCommitMessageTask.LLM.IJ.Slow.Params.this.getDiff());
/* 59 */       $this$build.text(CodeGenerateCommitMessageTask.LLM.IJ.Slow.Schema.INSTANCE.getText().getName(), CodeGenerateCommitMessageTask.LLM.IJ.Slow.Params.this.getText());
/* 60 */       $this$build.optText(CodeGenerateCommitMessageTask.LLM.IJ.Slow.Schema.INSTANCE.getInstruction().getName(), CodeGenerateCommitMessageTask.LLM.IJ.Slow.Params.this.getInstruction()); }
/*    */ 
/*    */     
/*    */     CodeGenerateCommitMessageTask$LLM$IJ$Slow$Params$attributes$1() {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\code\CodeGenerateCommitMessageTask$LLM$IJ$Slow$Params.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */