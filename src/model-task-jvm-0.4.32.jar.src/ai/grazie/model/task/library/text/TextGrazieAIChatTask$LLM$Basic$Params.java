/*    */ package ai.grazie.model.task.library.text;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.v5.LLMChat;
/*    */ import ai.grazie.model.task.exec.TaskParameters;
/*    */ import ai.grazie.model.task.exec.TaskParametersAttributesExt;
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
/*    */ @Deprecated(message = "Use schema with task builder")
/*    */ @Serializable(with = TaskParameters.Serializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\b\b\007\030\000 \0172\0020\001:\001\017B\031\022\006\020\002\032\0020\003\022\n\b\002\020\004\032\004\030\0010\005¢\006\002\020\006R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\t\020\nR\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\013\020\fR\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\r\020\016¨\006\020"}, d2 = {"Lai/grazie/model/task/library/text/TextGrazieAIChatTask$LLM$Basic$Params;", "Lai/grazie/model/task/exec/TaskParameters;", "userPrompt", "", "history", "Lai/grazie/model/llm/chat/v5/LLMChat;", "(Ljava/lang/String;Lai/grazie/model/llm/chat/v5/LLMChat;)V", "attributes", "Lai/grazie/utils/attributes/Attributes;", "getAttributes", "()Lai/grazie/utils/attributes/Attributes;", "getHistory", "()Lai/grazie/model/llm/chat/v5/LLMChat;", "getUserPrompt", "()Ljava/lang/String;", "Companion", "model-task"})
/*    */ public final class Params
/*    */   extends TaskParameters
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String userPrompt;
/*    */   @Nullable
/*    */   private final LLMChat history;
/*    */   @NotNull
/*    */   private final Attributes attributes;
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/task/library/text/TextGrazieAIChatTask$LLM$Basic$Params$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/task/library/text/TextGrazieAIChatTask$LLM$Basic$Params;", "model-task"})
/*    */   public static final class Companion
/*    */   {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<TextGrazieAIChatTask.LLM.Basic.Params> serializer() {
/* 42 */       return (KSerializer<TextGrazieAIChatTask.LLM.Basic.Params>)TaskParameters.Serializer.INSTANCE;
/*    */     } } @NotNull
/* 44 */   public final String getUserPrompt() { return this.userPrompt; } public Params(@NotNull String userPrompt, @Nullable LLMChat history) { this.userPrompt = userPrompt; this.history = history;
/* 45 */     this.attributes = Attributes.Companion.build(new TextGrazieAIChatTask$LLM$Basic$Params$attributes$1()); } @NotNull public Attributes getAttributes() { return this.attributes; } @Nullable public final LLMChat getHistory() { return this.history; } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\002\n\002\030\002\n\000\020\000\032\0020\001*\0020\002H\n¢\006\002\b\003"}, d2 = {"<anonymous>", "", "Lai/grazie/utils/attributes/AttributesBuilder;", "invoke"}) static final class TextGrazieAIChatTask$LLM$Basic$Params$attributes$1 extends Lambda implements Function1<AttributesBuilder, Unit> {
/* 46 */     public final void invoke(AttributesBuilder $this$build) { Intrinsics.checkNotNullParameter($this$build, "$this$build"); $this$build.text("userPrompt", TextGrazieAIChatTask.LLM.Basic.Params.this.getUserPrompt());
/*    */       
/* 48 */       TaskParametersAttributesExt taskParametersAttributesExt1 = TaskParametersAttributesExt.INSTANCE; TextGrazieAIChatTask.LLM.Basic.Params params = TextGrazieAIChatTask.LLM.Basic.Params.this; TaskParametersAttributesExt $this$invoke_u24lambda_u240 = taskParametersAttributesExt1; int $i$a$-with-TextGrazieAIChatTask$LLM$Basic$Params$attributes$1$1 = 0;
/* 49 */       $this$invoke_u24lambda_u240.chatHistoryOpt($this$build, params.getHistory()); }
/*    */ 
/*    */     
/*    */     TextGrazieAIChatTask$LLM$Basic$Params$attributes$1() {
/*    */       super(1);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-task-jvm-0.4.32.jar!\ai\grazie\model\task\library\text\TextGrazieAIChatTask$LLM$Basic$Params.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */