/*    */ package ai.grazie.model.llm.chat.multimodal;
/*    */ 
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.ArrayListSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B3\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\016\020\006\032\n\022\004\022\0020\b\030\0010\007\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\033\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007¢\006\002\020\fJ\t\020\021\032\0020\005HÆ\003J\017\020\022\032\b\022\004\022\0020\b0\007HÆ\003J#\020\023\032\0020\0002\b\b\002\020\004\032\0020\0052\016\b\002\020\006\032\b\022\004\022\0020\b0\007HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\001HÖ\003J\t\020\027\032\0020\003HÖ\001J\t\020\030\032\0020\031HÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\027\020\006\032\b\022\004\022\0020\b0\007¢\006\b\n\000\032\004\b\r\020\016R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\017\020\020¨\006$"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;", "", "seen1", "", "role", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole;", "content", "", "Lai/grazie/model/llm/chat/multimodal/ContentElement;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole;Ljava/util/List;)V", "getContent", "()Ljava/util/List;", "getRole", "()Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatRole;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_llm", "$serializer", "Companion", "model-llm"})
/*    */ public final class LLMMultiModalChatMessage
/*    */ {
/*    */   @NotNull
/* 66 */   public static final Companion Companion = new Companion(null); @NotNull private final LLMMultiModalChatRole role; @NotNull private final List<ContentElement> content; @JvmField
/*    */   @NotNull
/* 68 */   private static final KSerializer<Object>[] $childSerializers; public LLMMultiModalChatMessage(@NotNull LLMMultiModalChatRole role, @NotNull List<ContentElement> content) { this.role = role; this.content = content; } static { KSerializer[] arrayOfKSerializer1 = new KSerializer[2]; arrayOfKSerializer1[0] = LLMMultiModalChatRole.Companion.serializer(); KClass[] arrayOfKClass = new KClass[2]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(InlineMediaElement.class); arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(TextElement.class); KSerializer[] arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = (KSerializer)InlineMediaElement.$serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)TextElement.$serializer.INSTANCE; arrayOfKSerializer1[1] = (KSerializer)new ArrayListSerializer((KSerializer)new SealedClassSerializer("ai.grazie.model.llm.chat.multimodal.ContentElement", Reflection.getOrCreateKotlinClass(ContentElement.class), arrayOfKClass, arrayOfKSerializer2, new java.lang.annotation.Annotation[0])); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer1; } @NotNull public final LLMMultiModalChatRole getRole() { return this.role; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"}) public static final class $serializer implements GeneratedSerializer<LLMMultiModalChatMessage> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])LLMMultiModalChatMessage.$childSerializers, arrayOfKSerializer2 = new KSerializer[2]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = arrayOfKSerializer1[1]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public LLMMultiModalChatMessage deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; LLMMultiModalChatRole lLMMultiModalChatRole = null; List list = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])LLMMultiModalChatMessage.$childSerializers; if (compositeDecoder.decodeSequentially()) { lLMMultiModalChatRole = (LLMMultiModalChatRole)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], lLMMultiModalChatRole); i |= 0x1; list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list); i |= 0x2; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: lLMMultiModalChatRole = (LLMMultiModalChatRole)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], lLMMultiModalChatRole); i |= 0x1; continue;case 1: list = (List)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], list); i |= 0x2; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new LLMMultiModalChatMessage(i, lLMMultiModalChatRole, list, null); } public void serialize(@NotNull Encoder encoder, @NotNull LLMMultiModalChatMessage value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); LLMMultiModalChatMessage.write$Self$model_llm(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.llm.chat.multimodal.LLMMultiModalChatMessage", INSTANCE, 2); pluginGeneratedSerialDescriptor.addElement("role", false); pluginGeneratedSerialDescriptor.addElement("content", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/chat/multimodal/LLMMultiModalChatMessage;", "model-llm"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<LLMMultiModalChatMessage> serializer() { return (KSerializer<LLMMultiModalChatMessage>)LLMMultiModalChatMessage.$serializer.INSTANCE; } } @NotNull public final List<ContentElement> getContent() { return this.content; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final LLMMultiModalChatRole component1() {
/*    */     return this.role;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final List<ContentElement> component2() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMMultiModalChatMessage copy(@NotNull LLMMultiModalChatRole role, @NotNull List<? extends ContentElement> content) {
/*    */     Intrinsics.checkNotNullParameter(role, "role");
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     return new LLMMultiModalChatMessage(role, content);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "LLMMultiModalChatMessage(role=" + this.role + ", content=" + this.content + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.role.hashCode();
/*    */     return result * 31 + this.content.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof LLMMultiModalChatMessage))
/*    */       return false; 
/*    */     LLMMultiModalChatMessage lLMMultiModalChatMessage = (LLMMultiModalChatMessage)other;
/*    */     return (this.role != lLMMultiModalChatMessage.role) ? false : (!!Intrinsics.areEqual(this.content, lLMMultiModalChatMessage.content));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\multimodal\LLMMultiModalChatMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */