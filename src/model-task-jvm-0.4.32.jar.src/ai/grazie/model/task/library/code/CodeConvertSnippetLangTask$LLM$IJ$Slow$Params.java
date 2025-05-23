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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\004\n\002\030\002\n\002\b\b\b\007\030\000 \0172\0020\001:\001\017B\035\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\006\020\005\032\0020\003¢\006\002\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\021\020\005\032\0020\003¢\006\b\n\000\032\004\b\013\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\fR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\016\020\f¨\006\020"}, d2 = {"Lai/grazie/model/task/library/code/CodeConvertSnippetLangTask$LLM$IJ$Slow$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "sourceLang", "", "targetLang", "snippet", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getSnippet", "()Ljava/lang/String;", "getSourceLang", "getTargetLang", "Companion", "model-task"})
/*    */ public final class Params
/*    */   extends TaskParameters
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String sourceLang;
/*    */   @NotNull
/*    */   private final String targetLang;
/*    */   @NotNull
/*    */   private final String snippet;
/*    */   @NotNull
/*    */   private final Attributes attributes;
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/code/CodeConvertSnippetLangTask$LLM$IJ$Slow$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/code/CodeConvertSnippetLangTask$LLM$IJ$Slow$Params;", "model-task"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<CodeConvertSnippetLangTask.LLM.IJ.Slow.Params> serializer() {
/* 49 */       return (KSerializer<CodeConvertSnippetLangTask.LLM.IJ.Slow.Params>)TaskParameters.Serializer.INSTANCE;
/*    */     }
/* 51 */   } @NotNull public final String getSourceLang() { return this.sourceLang; } @NotNull public final String getTargetLang() { return this.targetLang; } public Params(@NotNull String sourceLang, @NotNull String targetLang, @NotNull String snippet) { this.sourceLang = sourceLang; this.targetLang = targetLang; this.snippet = snippet;
/* 52 */     this.attributes = Attributes.Companion.build(new CodeConvertSnippetLangTask$LLM$IJ$Slow$Params$attributes$1()); } @NotNull public final String getSnippet() { return this.snippet; } @NotNull public Attributes getAttributes() { return this.attributes; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"})
/* 53 */   static final class CodeConvertSnippetLangTask$LLM$IJ$Slow$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> { public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("sourceLang", CodeConvertSnippetLangTask.LLM.IJ.Slow.Params.this.getSourceLang());
/* 54 */       $this$build.text("targetLang", CodeConvertSnippetLangTask.LLM.IJ.Slow.Params.this.getTargetLang());
/* 55 */       $this$build.text("snippet", CodeConvertSnippetLangTask.LLM.IJ.Slow.Params.this.getSnippet()); }
/*    */ 
/*    */     
/*    */     CodeConvertSnippetLangTask$LLM$IJ$Slow$Params$attributes$1() {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\code\CodeConvertSnippetLangTask$LLM$IJ$Slow$Params.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */