/*    */ package ai.grazie.model.llm.chat.multimodal;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\006\b\001\030\000 \0062\b\022\004\022\0020\0000\001:\001\006B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\007"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole;", "", "(Ljava/lang/String;I)V", "System", "Assistant", "User", "Companion", "model-llm"})
/*    */ public enum LLMMultiModalChatRole {
/* 10 */   System,
/* 11 */   Assistant,
/* 12 */   User; @NotNull public static final Companion Companion; @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate; static { Companion = new Companion(null);
/*    */     $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); }
/*    */ 
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*    */   static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*    */     public static final null INSTANCE = (null)new Function0<>();
/*    */     
/*    */     null() {
/*    */       super(0);
/*    */     }
/*    */     
/*    */     public final KSerializer<Object> invoke() {
/*    */       return EnumsKt.createSimpleEnumSerializer("ai.grazie.model.llm.chat.multimodal.LLMMultiModalChatRole", (Enum[])LLMMultiModalChatRole.values());
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole;", "model-llm"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<LLMMultiModalChatRole> serializer() {
/*    */       return get$cachedSerializer();
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\multimodal\LLMMultiModalChatRole.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */