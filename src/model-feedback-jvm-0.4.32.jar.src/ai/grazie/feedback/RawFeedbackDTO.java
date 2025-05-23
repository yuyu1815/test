/*    */ package ai.grazie.feedback;
/*    */ import ai.grazie.utils.mpp.UUID;
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\027\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 62\0020\001:\00256B_\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r\022\b\020\016\032\004\030\0010\017\022\b\020\020\032\004\030\0010\021¢\006\002\020\022BE\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\005\022\006\020\n\032\0020\013\022\006\020\f\032\0020\r\022\n\b\002\020\016\032\004\030\0010\017¢\006\002\020\023J\t\020 \032\0020\005HÆ\003J\t\020!\032\0020\007HÆ\003J\013\020\"\032\004\030\0010\005HÆ\003J\013\020#\032\004\030\0010\005HÆ\003J\t\020$\032\0020\013HÆ\003J\t\020%\032\0020\rHÆ\003J\013\020&\032\004\030\0010\017HÆ\003JU\020'\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\0052\n\b\002\020\t\032\004\030\0010\0052\b\b\002\020\n\032\0020\0132\b\b\002\020\f\032\0020\r2\n\b\002\020\016\032\004\030\0010\017HÆ\001J\023\020(\032\0020)2\b\020*\032\004\030\0010\001HÖ\003J\t\020+\032\0020\003HÖ\001J\t\020,\032\0020\017HÖ\001J&\020-\032\0020.2\006\020/\032\0020\0002\006\0200\032\002012\006\0202\032\00203HÁ\001¢\006\002\b4R\023\020\016\032\004\030\0010\017¢\006\b\n\000\032\004\b\024\020\025R\023\020\t\032\004\030\0010\005¢\006\b\n\000\032\004\b\026\020\027R\023\020\b\032\004\030\0010\005¢\006\b\n\000\032\004\b\030\020\027R\021\020\f\032\0020\r¢\006\b\n\000\032\004\b\031\020\032R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\033\020\034R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\035\020\036R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\037\020\027¨\0067"}, d2 = {"Lai/grazie/feedback/RawFeedbackDTO;", "", "seen1", "", "uid", "Lai/grazie/utils/mpp/UUID;", "creationTimestamp", "Lai/grazie/utils/mpp/time/Timestamp;", "author", "assignee", "status", "Lai/grazie/feedback/FeedbackStatus;", "body", "Lai/grazie/feedback/FeedbackBody;", "additionalData", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/UUID;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/UUID;Lai/grazie/utils/mpp/UUID;Lai/grazie/feedback/FeedbackStatus;Lai/grazie/feedback/FeedbackBody;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/UUID;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/UUID;Lai/grazie/utils/mpp/UUID;Lai/grazie/feedback/FeedbackStatus;Lai/grazie/feedback/FeedbackBody;Ljava/lang/String;)V", "getAdditionalData", "()Ljava/lang/String;", "getAssignee", "()Lai/grazie/utils/mpp/UUID;", "getAuthor", "getBody", "()Lai/grazie/feedback/FeedbackBody;", "getCreationTimestamp", "()Lai/grazie/utils/mpp/time/Timestamp;", "getStatus", "()Lai/grazie/feedback/FeedbackStatus;", "getUid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_feedback", "$serializer", "Companion", "model-feedback"})
/*    */ public final class RawFeedbackDTO {
/*    */   @NotNull
/*    */   private final UUID uid;
/*    */   @NotNull
/*    */   private final Timestamp creationTimestamp;
/*    */   @Nullable
/*    */   private final UUID author;
/*    */   @Nullable
/*    */   private final UUID assignee;
/*    */   @NotNull
/*    */   private final FeedbackStatus status;
/*    */   @NotNull
/*    */   private final FeedbackBody body;
/*    */   @NotNull
/* 41 */   public static final Companion Companion = new Companion(null); @Nullable private final String additionalData; @JvmField
/*    */   @NotNull
/* 43 */   private static final KSerializer<Object>[] $childSerializers; public RawFeedbackDTO(@NotNull UUID uid, @NotNull Timestamp creationTimestamp, @Nullable UUID author, @Nullable UUID assignee, @NotNull FeedbackStatus status, @NotNull FeedbackBody body, @Nullable String additionalData) { this.uid = uid;
/* 44 */     this.creationTimestamp = creationTimestamp;
/* 45 */     this.author = author;
/* 46 */     this.assignee = assignee;
/* 47 */     this.status = status;
/* 48 */     this.body = body;
/* 49 */     this.additionalData = additionalData; } @Nullable public final String getAdditionalData() { return this.additionalData; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[7];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = null;
/*    */     arrayOfKSerializer[3] = null;
/*    */     arrayOfKSerializer[4] = FeedbackStatus.Companion.serializer();
/*    */     arrayOfKSerializer[5] = FeedbackBody.Companion.serializer();
/*    */     arrayOfKSerializer[6] = null;
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/feedback/RawFeedbackDTO.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/feedback/RawFeedbackDTO;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-feedback"})
/*    */   public static final class $serializer implements GeneratedSerializer<RawFeedbackDTO> {
/*    */     @NotNull
/*    */     public static final $serializer INSTANCE = new $serializer();
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] typeParametersSerializers() {
/*    */       return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public SerialDescriptor getDescriptor() {
/*    */       return (SerialDescriptor)descriptor;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public KSerializer<?>[] childSerializers() {
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])RawFeedbackDTO.$childSerializers, arrayOfKSerializer2 = new KSerializer[7];
/*    */       arrayOfKSerializer2[0] = (KSerializer)UUID.Serializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)UUID.Serializer.INSTANCE);
/*    */       arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)UUID.Serializer.INSTANCE);
/*    */       arrayOfKSerializer2[4] = arrayOfKSerializer1[4];
/*    */       arrayOfKSerializer2[5] = arrayOfKSerializer1[5];
/*    */       arrayOfKSerializer2[6] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public RawFeedbackDTO deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       UUID uUID1 = null;
/*    */       Timestamp timestamp = null;
/*    */       UUID uUID2 = null, uUID3 = null;
/*    */       FeedbackStatus feedbackStatus = null;
/*    */       FeedbackBody feedbackBody = null;
/*    */       String str = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])RawFeedbackDTO.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         uUID1 = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID1);
/*    */         i |= 0x1;
/*    */         timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */         i |= 0x2;
/*    */         uUID2 = (UUID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID2);
/*    */         i |= 0x4;
/*    */         uUID3 = (UUID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID3);
/*    */         i |= 0x8;
/*    */         feedbackStatus = (FeedbackStatus)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], feedbackStatus);
/*    */         i |= 0x10;
/*    */         feedbackBody = (FeedbackBody)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)arrayOfKSerializer[5], feedbackBody);
/*    */         i |= 0x20;
/*    */         str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy)StringSerializer.INSTANCE, str);
/*    */         i |= 0x40;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               uUID1 = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID1);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               uUID2 = (UUID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               uUID3 = (UUID)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               feedbackStatus = (FeedbackStatus)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], feedbackStatus);
/*    */               i |= 0x10;
/*    */               continue;
/*    */             case 5:
/*    */               feedbackBody = (FeedbackBody)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)arrayOfKSerializer[5], feedbackBody);
/*    */               i |= 0x20;
/*    */               continue;
/*    */             case 6:
/*    */               str = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy)StringSerializer.INSTANCE, str);
/*    */               i |= 0x40;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new RawFeedbackDTO(i, uUID1, timestamp, uUID2, uUID3, feedbackStatus, feedbackBody, str, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull RawFeedbackDTO value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       RawFeedbackDTO.write$Self$model_feedback(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.feedback.RawFeedbackDTO", INSTANCE, 7);
/*    */       pluginGeneratedSerialDescriptor.addElement("uid", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("creationTimestamp", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("author", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("assignee", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("status", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("body", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("additionalData", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/feedback/RawFeedbackDTO$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/feedback/RawFeedbackDTO;", "model-feedback"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<RawFeedbackDTO> serializer() {
/*    */       return (KSerializer<RawFeedbackDTO>)RawFeedbackDTO.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UUID getUid() {
/*    */     return this.uid;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp getCreationTimestamp() {
/*    */     return this.creationTimestamp;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final UUID getAuthor() {
/*    */     return this.author;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final UUID getAssignee() {
/*    */     return this.assignee;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FeedbackStatus getStatus() {
/*    */     return this.status;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FeedbackBody getBody() {
/*    */     return this.body;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final UUID component1() {
/*    */     return this.uid;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp component2() {
/*    */     return this.creationTimestamp;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final UUID component3() {
/*    */     return this.author;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final UUID component4() {
/*    */     return this.assignee;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FeedbackStatus component5() {
/*    */     return this.status;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final FeedbackBody component6() {
/*    */     return this.body;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component7() {
/*    */     return this.additionalData;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final RawFeedbackDTO copy(@NotNull UUID uid, @NotNull Timestamp creationTimestamp, @Nullable UUID author, @Nullable UUID assignee, @NotNull FeedbackStatus status, @NotNull FeedbackBody body, @Nullable String additionalData) {
/*    */     Intrinsics.checkNotNullParameter(uid, "uid");
/*    */     Intrinsics.checkNotNullParameter(creationTimestamp, "creationTimestamp");
/*    */     Intrinsics.checkNotNullParameter(status, "status");
/*    */     Intrinsics.checkNotNullParameter(body, "body");
/*    */     return new RawFeedbackDTO(uid, creationTimestamp, author, assignee, status, body, additionalData);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "RawFeedbackDTO(uid=" + this.uid + ", creationTimestamp=" + this.creationTimestamp + ", author=" + this.author + ", assignee=" + this.assignee + ", status=" + this.status + ", body=" + this.body + ", additionalData=" + this.additionalData + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.uid.hashCode();
/*    */     result = result * 31 + this.creationTimestamp.hashCode();
/*    */     result = result * 31 + ((this.author == null) ? 0 : this.author.hashCode());
/*    */     result = result * 31 + ((this.assignee == null) ? 0 : this.assignee.hashCode());
/*    */     result = result * 31 + this.status.hashCode();
/*    */     result = result * 31 + this.body.hashCode();
/*    */     return result * 31 + ((this.additionalData == null) ? 0 : this.additionalData.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof RawFeedbackDTO))
/*    */       return false; 
/*    */     RawFeedbackDTO rawFeedbackDTO = (RawFeedbackDTO)other;
/*    */     return !Intrinsics.areEqual(this.uid, rawFeedbackDTO.uid) ? false : (!Intrinsics.areEqual(this.creationTimestamp, rawFeedbackDTO.creationTimestamp) ? false : (!Intrinsics.areEqual(this.author, rawFeedbackDTO.author) ? false : (!Intrinsics.areEqual(this.assignee, rawFeedbackDTO.assignee) ? false : ((this.status != rawFeedbackDTO.status) ? false : (!Intrinsics.areEqual(this.body, rawFeedbackDTO.body) ? false : (!!Intrinsics.areEqual(this.additionalData, rawFeedbackDTO.additionalData)))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-feedback-jvm-0.4.32.jar!\ai\grazie\feedback\RawFeedbackDTO.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */