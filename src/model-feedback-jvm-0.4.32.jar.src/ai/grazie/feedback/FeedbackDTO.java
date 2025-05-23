/*    */ package ai.grazie.feedback;
/*    */ import ai.grazie.utils.mpp.UUID;
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\\\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\030\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 82\0020\001:\00278B_\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\t\022\b\020\013\032\004\030\0010\f\022\b\020\r\032\004\030\0010\016\022\b\020\017\032\004\030\0010\020\022\b\020\021\032\004\030\0010\022¢\006\002\020\023BE\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\t\022\006\020\013\032\0020\f\022\006\020\r\032\0020\016\022\n\b\002\020\017\032\004\030\0010\020¢\006\002\020\024J\t\020\"\032\0020\005HÆ\003J\t\020#\032\0020\007HÆ\003J\013\020$\032\004\030\0010\tHÆ\003J\013\020%\032\004\030\0010\tHÆ\003J\t\020&\032\0020\fHÆ\003J\t\020'\032\0020\016HÆ\003J\013\020(\032\004\030\0010\020HÆ\003JU\020)\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\n\b\002\020\b\032\004\030\0010\t2\n\b\002\020\n\032\004\030\0010\t2\b\b\002\020\013\032\0020\f2\b\b\002\020\r\032\0020\0162\n\b\002\020\017\032\004\030\0010\020HÆ\001J\023\020*\032\0020+2\b\020,\032\004\030\0010\001HÖ\003J\t\020-\032\0020\003HÖ\001J\t\020.\032\0020\020HÖ\001J&\020/\032\002002\006\0201\032\0020\0002\006\0202\032\002032\006\0204\032\00205HÁ\001¢\006\002\b6R\023\020\017\032\004\030\0010\020¢\006\b\n\000\032\004\b\025\020\026R\023\020\n\032\004\030\0010\t¢\006\b\n\000\032\004\b\027\020\030R\023\020\b\032\004\030\0010\t¢\006\b\n\000\032\004\b\031\020\030R\021\020\r\032\0020\016¢\006\b\n\000\032\004\b\032\020\033R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\034\020\035R\021\020\013\032\0020\f¢\006\b\n\000\032\004\b\036\020\037R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b \020!¨\0069"}, d2 = {"Lai/grazie/feedback/FeedbackDTO;", "", "seen1", "", "uid", "Lai/grazie/utils/mpp/UUID;", "creationTimestamp", "Lai/grazie/utils/mpp/time/Timestamp;", "author", "Lai/grazie/feedback/FeedbackUserDTO;", "assignee", "status", "Lai/grazie/feedback/FeedbackStatus;", "body", "Lai/grazie/feedback/FeedbackBody;", "additionalData", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/UUID;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/feedback/FeedbackUserDTO;Lai/grazie/feedback/FeedbackUserDTO;Lai/grazie/feedback/FeedbackStatus;Lai/grazie/feedback/FeedbackBody;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/UUID;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/feedback/FeedbackUserDTO;Lai/grazie/feedback/FeedbackUserDTO;Lai/grazie/feedback/FeedbackStatus;Lai/grazie/feedback/FeedbackBody;Ljava/lang/String;)V", "getAdditionalData", "()Ljava/lang/String;", "getAssignee", "()Lai/grazie/feedback/FeedbackUserDTO;", "getAuthor", "getBody", "()Lai/grazie/feedback/FeedbackBody;", "getCreationTimestamp", "()Lai/grazie/utils/mpp/time/Timestamp;", "getStatus", "()Lai/grazie/feedback/FeedbackStatus;", "getUid", "()Lai/grazie/utils/mpp/UUID;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_feedback", "$serializer", "Companion", "model-feedback"})
/*    */ public final class FeedbackDTO {
/*    */   @NotNull
/* 17 */   public static final Companion Companion = new Companion(null); @NotNull private final UUID uid; @NotNull private final Timestamp creationTimestamp; @Nullable private final FeedbackUserDTO author; @Nullable private final FeedbackUserDTO assignee; @NotNull private final FeedbackStatus status; @NotNull private final FeedbackBody body; @Nullable
/*    */   private final String additionalData; @JvmField
/*    */   @NotNull
/* 20 */   private static final KSerializer<Object>[] $childSerializers; public FeedbackDTO(@NotNull UUID uid, @NotNull Timestamp creationTimestamp, @Nullable FeedbackUserDTO author, @Nullable FeedbackUserDTO assignee, @NotNull FeedbackStatus status, @NotNull FeedbackBody body, @Nullable String additionalData) { this.uid = uid;
/* 21 */     this.creationTimestamp = creationTimestamp;
/* 22 */     this.author = author;
/* 23 */     this.assignee = assignee;
/* 24 */     this.status = status;
/* 25 */     this.body = body;
/* 26 */     this.additionalData = additionalData; } static { KSerializer[] arrayOfKSerializer = new KSerializer[7]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = FeedbackStatus.Companion.serializer(); arrayOfKSerializer[5] = FeedbackBody.Companion.serializer(); arrayOfKSerializer[6] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Nullable public final String getAdditionalData() { return this.additionalData; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/feedback/FeedbackDTO.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/feedback/FeedbackDTO;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-feedback"})
/*    */   public static final class $serializer implements GeneratedSerializer<FeedbackDTO> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])FeedbackDTO.$childSerializers, arrayOfKSerializer2 = new KSerializer[7];
/*    */       arrayOfKSerializer2[0] = (KSerializer)UUID.Serializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)FeedbackUserDTO.$serializer.INSTANCE);
/*    */       arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)FeedbackUserDTO.$serializer.INSTANCE);
/*    */       arrayOfKSerializer2[4] = arrayOfKSerializer1[4];
/*    */       arrayOfKSerializer2[5] = arrayOfKSerializer1[5];
/*    */       arrayOfKSerializer2[6] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public FeedbackDTO deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       UUID uUID = null;
/*    */       Timestamp timestamp = null;
/*    */       FeedbackUserDTO feedbackUserDTO1 = null, feedbackUserDTO2 = null;
/*    */       FeedbackStatus feedbackStatus = null;
/*    */       FeedbackBody feedbackBody = null;
/*    */       String str = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])FeedbackDTO.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID);
/*    */         i |= 0x1;
/*    */         timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */         i |= 0x2;
/*    */         feedbackUserDTO1 = (FeedbackUserDTO)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)FeedbackUserDTO.$serializer.INSTANCE, feedbackUserDTO1);
/*    */         i |= 0x4;
/*    */         feedbackUserDTO2 = (FeedbackUserDTO)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)FeedbackUserDTO.$serializer.INSTANCE, feedbackUserDTO2);
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
/*    */               uUID = (UUID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)UUID.Serializer.INSTANCE, uUID);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               feedbackUserDTO1 = (FeedbackUserDTO)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)FeedbackUserDTO.$serializer.INSTANCE, feedbackUserDTO1);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               feedbackUserDTO2 = (FeedbackUserDTO)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)FeedbackUserDTO.$serializer.INSTANCE, feedbackUserDTO2);
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
/*    */       return new FeedbackDTO(i, uUID, timestamp, feedbackUserDTO1, feedbackUserDTO2, feedbackStatus, feedbackBody, str, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull FeedbackDTO value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       FeedbackDTO.write$Self$model_feedback(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.feedback.FeedbackDTO", INSTANCE, 7);
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
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/feedback/FeedbackDTO$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/feedback/FeedbackDTO;", "model-feedback"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<FeedbackDTO> serializer() {
/*    */       return (KSerializer<FeedbackDTO>)FeedbackDTO.$serializer.INSTANCE;
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
/*    */   public final FeedbackUserDTO getAuthor() {
/*    */     return this.author;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final FeedbackUserDTO getAssignee() {
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
/*    */   public final FeedbackUserDTO component3() {
/*    */     return this.author;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final FeedbackUserDTO component4() {
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
/*    */   public final FeedbackDTO copy(@NotNull UUID uid, @NotNull Timestamp creationTimestamp, @Nullable FeedbackUserDTO author, @Nullable FeedbackUserDTO assignee, @NotNull FeedbackStatus status, @NotNull FeedbackBody body, @Nullable String additionalData) {
/*    */     Intrinsics.checkNotNullParameter(uid, "uid");
/*    */     Intrinsics.checkNotNullParameter(creationTimestamp, "creationTimestamp");
/*    */     Intrinsics.checkNotNullParameter(status, "status");
/*    */     Intrinsics.checkNotNullParameter(body, "body");
/*    */     return new FeedbackDTO(uid, creationTimestamp, author, assignee, status, body, additionalData);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "FeedbackDTO(uid=" + this.uid + ", creationTimestamp=" + this.creationTimestamp + ", author=" + this.author + ", assignee=" + this.assignee + ", status=" + this.status + ", body=" + this.body + ", additionalData=" + this.additionalData + ")";
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
/*    */     if (!(other instanceof FeedbackDTO))
/*    */       return false; 
/*    */     FeedbackDTO feedbackDTO = (FeedbackDTO)other;
/*    */     return !Intrinsics.areEqual(this.uid, feedbackDTO.uid) ? false : (!Intrinsics.areEqual(this.creationTimestamp, feedbackDTO.creationTimestamp) ? false : (!Intrinsics.areEqual(this.author, feedbackDTO.author) ? false : (!Intrinsics.areEqual(this.assignee, feedbackDTO.assignee) ? false : ((this.status != feedbackDTO.status) ? false : (!Intrinsics.areEqual(this.body, feedbackDTO.body) ? false : (!!Intrinsics.areEqual(this.additionalData, feedbackDTO.additionalData)))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-feedback-jvm-0.4.32.jar!\ai\grazie\feedback\FeedbackDTO.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */