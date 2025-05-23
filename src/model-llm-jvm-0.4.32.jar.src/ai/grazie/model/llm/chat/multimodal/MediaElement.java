/*    */ package ai.grazie.model.llm.chat.multimodal;
/*    */ 
/*    */ import ai.grazie.model.cloud.ContentType;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\bw\030\000 \0062\0020\001:\001\006R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005\001\001\007ø\001\000\002\006\n\004\b!0\001¨\006\bÀ\006\001"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/MediaElement;", "Lai/grazie/model/llm/chat/multimodal/ContentElement;", "mimeType", "Lai/grazie/model/cloud/ContentType;", "getMimeType", "()Lai/grazie/model/cloud/ContentType;", "Companion", "Lai/grazie/model/llm/chat/multimodal/InlineMediaElement;", "model-llm"})
/*    */ public interface MediaElement
/*    */   extends ContentElement
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = Companion.$$INSTANCE;
/*    */   
/*    */   @NotNull
/*    */   ContentType getMimeType();
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/MediaElement$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/chat/multimodal/MediaElement;", "model-llm"})
/*    */   public static final class Companion
/*    */   {
/*    */     @NotNull
/*    */     public final KSerializer<MediaElement> serializer() {
/* 79 */       KClass[] arrayOfKClass = new KClass[1]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(InlineMediaElement.class); KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)InlineMediaElement.$serializer.INSTANCE; return (KSerializer<MediaElement>)new SealedClassSerializer("ai.grazie.model.llm.chat.multimodal.MediaElement", Reflection.getOrCreateKotlinClass(MediaElement.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\multimodal\MediaElement.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */