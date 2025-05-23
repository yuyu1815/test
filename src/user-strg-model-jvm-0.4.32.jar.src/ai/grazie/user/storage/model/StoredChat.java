/*     */ package ai.grazie.user.storage.model;
/*     */ 
/*     */ import ai.grazie.model.llm.chat.v5.LLMChat;
/*     */ import ai.grazie.model.llm.chat.v5.LLMChat$;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Deprecated(message = "JBAI-5047 in favour of ai.grazie.model.chat.StoredChat")
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 \"2\0020\001:\002!\"B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\013J\t\020\020\032\0020\005HÆ\003J\t\020\021\032\0020\007HÆ\003J\035\020\022\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\001HÖ\003J\t\020\026\032\0020\003HÖ\001J\t\020\027\032\0020\030HÖ\001J&\020\031\032\0020\0322\006\020\033\032\0020\0002\006\020\034\032\0020\0352\006\020\036\032\0020\037HÁ\001¢\006\002\b R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\f\020\rR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\016\020\017¨\006#"}, d2 = {"Lai/grazie/user/storage/model/StoredChat;", "", "seen1", "", "storedChatMetadata", "Lai/grazie/user/storage/model/StoredChatMetadata;", "content", "Lai/grazie/model/llm/chat/v5/LLMChat;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/user/storage/model/StoredChatMetadata;Lai/grazie/model/llm/chat/v5/LLMChat;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/user/storage/model/StoredChatMetadata;Lai/grazie/model/llm/chat/v5/LLMChat;)V", "getContent", "()Lai/grazie/model/llm/chat/v5/LLMChat;", "getStoredChatMetadata", "()Lai/grazie/user/storage/model/StoredChatMetadata;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$user_strg_model", "$serializer", "Companion", "user-strg-model"})
/*     */ public final class StoredChat
/*     */ {
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final StoredChatMetadata storedChatMetadata;
/*     */   @NotNull
/*     */   private final LLMChat content;
/*     */   
/*     */   public StoredChat(@NotNull StoredChatMetadata storedChatMetadata, @NotNull LLMChat content) {
/* 132 */     this.storedChatMetadata = storedChatMetadata;
/* 133 */     this.content = content; } @NotNull public final LLMChat getContent() { return this.content; }
/*     */ 
/*     */   
/*     */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/user/storage/model/StoredChat.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/user/storage/model/StoredChat;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "user-strg-model"})
/*     */   public static final class $serializer implements GeneratedSerializer<StoredChat> {
/*     */     @NotNull
/*     */     public static final $serializer INSTANCE = new $serializer();
/*     */     
/*     */     @NotNull
/*     */     public KSerializer<?>[] typeParametersSerializers() {
/*     */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public SerialDescriptor getDescriptor() {
/*     */       return (SerialDescriptor)descriptor;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public KSerializer<?>[] childSerializers() {
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*     */       arrayOfKSerializer[0] = (KSerializer)StoredChatMetadata.$serializer.INSTANCE;
/*     */       arrayOfKSerializer[1] = (KSerializer)LLMChat$.serializer.INSTANCE;
/*     */       return (KSerializer<?>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public StoredChat deserialize(@NotNull Decoder decoder) {
/*     */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       boolean bool = true;
/*     */       int i = 0;
/*     */       StoredChatMetadata storedChatMetadata = null;
/*     */       LLMChat lLMChat = null;
/*     */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */       if (compositeDecoder.decodeSequentially()) {
/*     */         storedChatMetadata = (StoredChatMetadata)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StoredChatMetadata.$serializer.INSTANCE, storedChatMetadata);
/*     */         i |= 0x1;
/*     */         lLMChat = (LLMChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMChat$.serializer.INSTANCE, lLMChat);
/*     */         i |= 0x2;
/*     */       } else {
/*     */         while (bool) {
/*     */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */           switch (j) {
/*     */             case -1:
/*     */               bool = false;
/*     */               continue;
/*     */             case 0:
/*     */               storedChatMetadata = (StoredChatMetadata)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StoredChatMetadata.$serializer.INSTANCE, storedChatMetadata);
/*     */               i |= 0x1;
/*     */               continue;
/*     */             case 1:
/*     */               lLMChat = (LLMChat)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)LLMChat$.serializer.INSTANCE, lLMChat);
/*     */               i |= 0x2;
/*     */               continue;
/*     */           } 
/*     */           throw new UnknownFieldException(j);
/*     */         } 
/*     */       } 
/*     */       compositeDecoder.endStructure(serialDescriptor);
/*     */       return new StoredChat(i, storedChatMetadata, lLMChat, null);
/*     */     }
/*     */     
/*     */     public void serialize(@NotNull Encoder encoder, @NotNull StoredChat value) {
/*     */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */       Intrinsics.checkNotNullParameter(value, "value");
/*     */       SerialDescriptor serialDescriptor = getDescriptor();
/*     */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */       StoredChat.write$Self$user_strg_model(value, compositeEncoder, serialDescriptor);
/*     */       compositeEncoder.endStructure(serialDescriptor);
/*     */     }
/*     */     
/*     */     static {
/*     */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.user.storage.model.StoredChat", INSTANCE, 2);
/*     */       pluginGeneratedSerialDescriptor.addElement("storedChatMetadata", false);
/*     */       pluginGeneratedSerialDescriptor.addElement("content", false);
/*     */       descriptor = pluginGeneratedSerialDescriptor;
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/user/storage/model/StoredChat$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/user/storage/model/StoredChat;", "user-strg-model"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<StoredChat> serializer() {
/*     */       return (KSerializer<StoredChat>)StoredChat.$serializer.INSTANCE;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final StoredChatMetadata getStoredChatMetadata() {
/*     */     return this.storedChatMetadata;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final StoredChatMetadata component1() {
/*     */     return this.storedChatMetadata;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final LLMChat component2() {
/*     */     return this.content;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final StoredChat copy(@NotNull StoredChatMetadata storedChatMetadata, @NotNull LLMChat content) {
/*     */     Intrinsics.checkNotNullParameter(storedChatMetadata, "storedChatMetadata");
/*     */     Intrinsics.checkNotNullParameter(content, "content");
/*     */     return new StoredChat(storedChatMetadata, content);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "StoredChat(storedChatMetadata=" + this.storedChatMetadata + ", content=" + this.content + ")";
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     result = this.storedChatMetadata.hashCode();
/*     */     return result * 31 + this.content.hashCode();
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (!(other instanceof StoredChat))
/*     */       return false; 
/*     */     StoredChat storedChat = (StoredChat)other;
/*     */     return !Intrinsics.areEqual(this.storedChatMetadata, storedChat.storedChatMetadata) ? false : (!!Intrinsics.areEqual(this.content, storedChat.content));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\user-strg-model-jvm-0.4.32.jar!\ai\grazi\\user\storage\model\StoredChat.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */