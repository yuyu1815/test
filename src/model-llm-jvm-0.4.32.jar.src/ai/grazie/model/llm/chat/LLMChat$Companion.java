/*    */ package ai.grazie.model.llm.chat;
/*    */ 
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\037\020\003\032\0020\0042\027\020\005\032\023\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\tJ\017\020\n\032\b\022\004\022\0020\0040\013HÆ\001¨\006\f"}, d2 = {"Lai/grazie/model/llm/chat/LLMChat$Companion;", "", "()V", "build", "Lai/grazie/model/llm/chat/LLMChat;", "body", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/LLMChat$Builder;", "", "Lkotlin/ExtensionFunctionType;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-llm"})
/*    */ public final class Companion {
/*    */   @NotNull
/* 10 */   public final KSerializer<LLMChat> serializer() { return (KSerializer<LLMChat>)LLMChat.$serializer.INSTANCE; } private Companion() {} @NotNull
/*    */   public final LLMChat build(@NotNull Function1 body) {
/* 12 */     Intrinsics.checkNotNullParameter(body, "body"); LLMChat.Builder builder = new LLMChat.Builder(null, 1, null); body.invoke(builder); return builder.build();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\LLMChat$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */