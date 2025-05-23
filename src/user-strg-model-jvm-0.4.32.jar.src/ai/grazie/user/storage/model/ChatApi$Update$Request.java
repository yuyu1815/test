/*    */ package ai.grazie.user.storage.model;
/*    */ 
/*    */ import ai.grazie.model.llm.chat.v5.LLMChat;
/*    */ import ai.grazie.model.llm.chat.v5.LLMChat$;
/*    */ import ai.grazie.utils.mpp.UUID;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.BooleanSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*    */ import kotlinx.serialization.internal.StringSerializer;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\024\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 *2\0020\001:\002)*B?\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\006\020\b\032\0020\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B%\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013¢\006\002\020\017J\t\020\030\032\0020\005HÆ\003J\t\020\031\032\0020\007HÆ\003J\t\020\032\032\0020\tHÆ\003J\t\020\033\032\0020\013HÆ\003J1\020\034\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\013HÆ\001J\023\020\035\032\0020\t2\b\020\036\032\004\030\0010\001HÖ\003J\t\020\037\032\0020\003HÖ\001J\t\020 \032\0020\007HÖ\001J&\020!\032\0020\"2\006\020#\032\0020\0002\006\020$\032\0020%2\006\020&\032\0020'HÁ\001¢\006\002\b(R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\020\020\021R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\022\020\023R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\024\020\025R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\026\020\027¨\006+"}, d2 = {"Lai/grazie/user/storage/model/ChatApi$Update$Request;", "", "seen1", "", "id", "Lai/grazie/utils/mpp/UUID;", "name", "", "pinned", "", "content", "Lai/grazie/model/llm/chat/v5/LLMChat;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/UUID;Ljava/lang/String;ZLai/grazie/model/llm/chat/v5/LLMChat;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/UUID;Ljava/lang/String;ZLai/grazie/model/llm/chat/v5/LLMChat;)V", "getContent", "()Lai/grazie/model/llm/chat/v5/LLMChat;", "getId", "()Lai/grazie/utils/mpp/UUID;", "getName", "()Ljava/lang/String;", "getPinned", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$user_strg_model", "$serializer", "Companion", "user-strg-model"})
/*    */ public final class Request
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final UUID id;
/*    */   @NotNull
/*    */   private final String name;
/*    */   
/*    */   public Request(@NotNull UUID id, @NotNull String name, boolean pinned, @NotNull LLMChat content) {
/* 92 */     this.id = id; this.name = name; this.pinned = pinned; this.content = content; } private final boolean pinned; @NotNull private final LLMChat content; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/user/storage/model/ChatApi.Update.Request.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/user/storage/model/ChatApi$Update$Request;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "user-strg-model"}) public static final class $serializer implements GeneratedSerializer<Request> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = (KSerializer)UUID.Serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)LLMChat$.serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public ChatApi.Update.Request deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; UUID uUID = null; String str = null; boolean bool1 = false; LLMChat lLMChat = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID); i |= 0x1; str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 2); i |= 0x4; lLMChat = (LLMChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)LLMChat$.serializer.INSTANCE, lLMChat); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID); i |= 0x1; continue;case 1: str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 2); i |= 0x4; continue;case 3: lLMChat = (LLMChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)LLMChat$.serializer.INSTANCE, lLMChat); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new ChatApi.Update.Request(i, uUID, str, bool1, lLMChat, null); } public void serialize(@NotNull Encoder encoder, @NotNull ChatApi.Update.Request value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); ChatApi.Update.Request.write$Self$user_strg_model(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.user.storage.model.ChatApi.Update.Request", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("id", false); pluginGeneratedSerialDescriptor.addElement("name", false); pluginGeneratedSerialDescriptor.addElement("pinned", false); pluginGeneratedSerialDescriptor.addElement("content", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/user/storage/model/ChatApi$Update$Request$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/user/storage/model/ChatApi$Update$Request;", "user-strg-model"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ChatApi.Update.Request> serializer() { return (KSerializer<ChatApi.Update.Request>)ChatApi.Update.Request.$serializer.INSTANCE; } } @NotNull public final UUID getId() { return this.id; } @NotNull public final String getName() { return this.name; } public final boolean getPinned() { return this.pinned; } @NotNull public final LLMChat getContent() { return this.content; }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final UUID component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component2() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   public final boolean component3() {
/*    */     return this.pinned;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final LLMChat component4() {
/*    */     return this.content;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Request copy(@NotNull UUID id, @NotNull String name, boolean pinned, @NotNull LLMChat content) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     Intrinsics.checkNotNullParameter(content, "content");
/*    */     return new Request(id, name, pinned, content);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "Request(id=" + this.id + ", name=" + this.name + ", pinned=" + this.pinned + ", content=" + this.content + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.id.hashCode();
/*    */     result = result * 31 + this.name.hashCode();
/*    */     result = result * 31 + Boolean.hashCode(this.pinned);
/*    */     return result * 31 + this.content.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof Request))
/*    */       return false; 
/*    */     Request request = (Request)other;
/*    */     return !Intrinsics.areEqual(this.id, request.id) ? false : (!Intrinsics.areEqual(this.name, request.name) ? false : ((this.pinned != request.pinned) ? false : (!!Intrinsics.areEqual(this.content, request.content))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-strg-model-jvm-0.4.32.jar!\ai\grazi\\user\storage\model\ChatApi$Update$Request.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */