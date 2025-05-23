/*    */ package ai.grazie.license;
/*    */ 
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
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
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
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
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 !2\0020\001:\002 !B+\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\020\005\032\004\030\0010\006\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\025\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\nJ\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\006HÆ\003J\035\020\021\032\0020\0002\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\003HÖ\001J\t\020\026\032\0020\027HÖ\001J&\020\030\032\0020\0312\006\020\032\032\0020\0002\006\020\033\032\0020\0342\006\020\035\032\0020\036HÁ\001¢\006\002\b\037R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\r\020\016¨\006\""}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "", "seen1", "", "usersLimit", "till", "Lai/grazie/utils/mpp/time/Timestamp;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILai/grazie/utils/mpp/time/Timestamp;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILai/grazie/utils/mpp/time/Timestamp;)V", "getTill", "()Lai/grazie/utils/mpp/time/Timestamp;", "getUsersLimit", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_license", "$serializer", "Companion", "model-license"})
/*    */ public final class TrialInfo
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final int usersLimit;
/*    */   @NotNull
/*    */   private final Timestamp till;
/*    */   
/*    */   public TrialInfo(int usersLimit, @NotNull Timestamp till) {
/* 86 */     this.usersLimit = usersLimit;
/* 87 */     this.till = till; } @NotNull public final Timestamp getTill() { return this.till; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/license/JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-license"})
/*    */   public static final class $serializer implements GeneratedSerializer<TrialInfo> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */       arrayOfKSerializer[0] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public JBALicense.AdditionalData.IDESAdditionalData.TrialInfo deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0, j = 0;
/*    */       Timestamp timestamp = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */         i |= 0x2;
/*    */       } else {
/*    */         while (bool) {
/*    */           int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (k) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */               i |= 0x2;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(k);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new JBALicense.AdditionalData.IDESAdditionalData.TrialInfo(i, j, timestamp, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull JBALicense.AdditionalData.IDESAdditionalData.TrialInfo value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.write$Self$model_license(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.license.JBALicense.AdditionalData.IDESAdditionalData.TrialInfo", INSTANCE, 2);
/*    */       pluginGeneratedSerialDescriptor.addElement("usersLimit", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("till", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "model-license"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<JBALicense.AdditionalData.IDESAdditionalData.TrialInfo> serializer() {
/*    */       return (KSerializer<JBALicense.AdditionalData.IDESAdditionalData.TrialInfo>)JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   public final int getUsersLimit() {
/*    */     return this.usersLimit;
/*    */   }
/*    */   
/*    */   public final int component1() {
/*    */     return this.usersLimit;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp component2() {
/*    */     return this.till;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final TrialInfo copy(int usersLimit, @NotNull Timestamp till) {
/*    */     Intrinsics.checkNotNullParameter(till, "till");
/*    */     return new TrialInfo(usersLimit, till);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "TrialInfo(usersLimit=" + this.usersLimit + ", till=" + this.till + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = Integer.hashCode(this.usersLimit);
/*    */     return result * 31 + this.till.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof TrialInfo))
/*    */       return false; 
/*    */     TrialInfo trialInfo = (TrialInfo)other;
/*    */     return (this.usersLimit != trialInfo.usersLimit) ? false : (!!Intrinsics.areEqual(this.till, trialInfo.till));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\JBALicense$AdditionalData$IDESAdditionalData$TrialInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */