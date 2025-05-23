/*    */ package ai.grazie.model.llm.chat.multimodal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J%\020\003\032\0020\0042\027\020\005\032\023\022\004\022\0020\007\022\004\022\0020\b0\006¢\006\002\b\tH\bø\001\000J\017\020\n\032\b\022\004\022\0020\0040\013HÆ\001\002\007\n\005\b20\001¨\006\f"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$Companion;", "", "()V", "build", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat;", "body", "Lkotlin/Function1;", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChat$Builder;", "", "Lkotlin/ExtensionFunctionType;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-llm"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<LLMMultiModalChat> serializer() {
/* 45 */     return (KSerializer<LLMMultiModalChat>)LLMMultiModalChat.$serializer.INSTANCE; } @NotNull
/*    */   public final LLMMultiModalChat build(@NotNull Function1 body) {
/* 47 */     Intrinsics.checkNotNullParameter(body, "body"); int $i$f$build = 0; LLMMultiModalChat.Builder builder = new LLMMultiModalChat.Builder(null, 1, null); body.invoke(builder); return builder.build();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\multimodal\LLMMultiModalChat$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */