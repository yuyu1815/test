/*    */ package ai.grazie.model.llm.chat.multimodal;
/*    */ 
/*    */ import ai.grazie.model.cloud.ContentType;
/*    */ import ai.grazie.utils.mpp.Base64;
/*    */ import kotlin.Metadata;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000$\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\022\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bJ\017\020\t\032\b\022\004\022\0020\0040\nHÆ\001¨\006\013"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/InlineMediaElement$Companion;", "", "()V", "ofBytes", "Lai/grazie/model/llm/chat/multimodal/InlineMediaElement;", "type", "Lai/grazie/model/cloud/ContentType;", "data", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-llm"})
/*    */ public final class Companion
/*    */ {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/*    */   public final KSerializer<InlineMediaElement> serializer() {
/* 92 */     return (KSerializer<InlineMediaElement>)InlineMediaElement.$serializer.INSTANCE; } @NotNull
/*    */   public final InlineMediaElement ofBytes(@NotNull ContentType type, @NotNull byte[] data) {
/* 94 */     Intrinsics.checkNotNullParameter(type, "type"); Intrinsics.checkNotNullParameter(data, "data"); return new InlineMediaElement(type, Base64.INSTANCE.encode(data));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\multimodal\InlineMediaElement$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */