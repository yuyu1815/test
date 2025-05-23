/*    */ package ai.grazie.model.llm.chat.v5;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\037\020\003\032\0020\0042\027\020\005\032\023\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\t¨\006\n"}, d2 = {"Lai/grazie/model/llm/chat/v5/LLMChatRequest$Companion;", "", "()V", "build", "Lai/grazie/model/llm/chat/v5/LLMChatRequest;", "body", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/v5/LLMChatRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "model-llm"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final LLMChatRequest build(@NotNull Function1 body) {
/* 27 */     Intrinsics.checkNotNullParameter(body, "body"); LLMChatRequest.Builder builder = new LLMChatRequest.Builder(); body.invoke(builder); return builder.build();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\v5\LLMChatRequest$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */