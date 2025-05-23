/*    */ package ai.grazie.model.ab;
/*    */ 
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.BooleanSerializer;
/*    */ import kotlinx.serialization.internal.GeneratedSerializer;
/*    */ import kotlinx.serialization.internal.IntSerializer;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\004\n\002\020\013\n\000\n\002\030\002\n\002\b\025\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 *2\0020\001:\002)*BC\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\n\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB-\022\006\020\004\032\0020\005\022\006\020\006\032\0020\003\022\006\020\007\032\0020\003\022\006\020\b\032\0020\003\022\006\020\t\032\0020\n¢\006\002\020\016J\t\020\027\032\0020\005HÆ\003J\t\020\030\032\0020\003HÆ\003J\t\020\031\032\0020\003HÆ\003J\t\020\032\032\0020\003HÆ\003J\t\020\033\032\0020\nHÆ\003J;\020\034\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0032\b\b\002\020\007\032\0020\0032\b\b\002\020\b\032\0020\0032\b\b\002\020\t\032\0020\nHÆ\001J\023\020\035\032\0020\n2\b\020\036\032\004\030\0010\001HÖ\003J\t\020\037\032\0020\003HÖ\001J\t\020 \032\0020\005HÖ\001J&\020!\032\0020\"2\006\020#\032\0020\0002\006\020$\032\0020%2\006\020&\032\0020'HÁ\001¢\006\002\b(R\021\020\007\032\0020\003¢\006\b\n\000\032\004\b\017\020\020R\021\020\b\032\0020\003¢\006\b\n\000\032\004\b\021\020\020R\021\020\006\032\0020\003¢\006\b\n\000\032\004\b\022\020\020R\021\020\t\032\0020\n¢\006\b\n\000\032\004\b\023\020\024R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\025\020\026¨\006+"}, d2 = {"Lai/grazie/model/ab/ABTestingStatus;", "", "seen1", "", "setupId", "", "hashId", "bucketId", "groupId", "optedOut", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IIIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;IIIZ)V", "getBucketId", "()I", "getGroupId", "getHashId", "getOptedOut", "()Z", "getSetupId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_ab_testing", "$serializer", "Companion", "model-ab-testing"})
/*    */ public final class ABTestingStatus
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final String setupId;
/*    */   private final int hashId;
/*    */   private final int bucketId;
/*    */   private final int groupId;
/*    */   private final boolean optedOut;
/*    */   
/*    */   public ABTestingStatus(@NotNull String setupId, int hashId, int bucketId, int groupId, boolean optedOut) {
/* 68 */     this.setupId = setupId;
/* 69 */     this.hashId = hashId;
/* 70 */     this.bucketId = bucketId;
/* 71 */     this.groupId = groupId;
/* 72 */     this.optedOut = optedOut; } public final boolean getOptedOut() { return this.optedOut; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/ab/ABTestingStatus.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/ab/ABTestingStatus;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-ab-testing"})
/*    */   public static final class $serializer implements GeneratedSerializer<ABTestingStatus> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[5];
/*    */       arrayOfKSerializer[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer[3] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer[4] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public ABTestingStatus deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str = null;
/*    */       int j = 0, k = 0, m = 0;
/*    */       boolean bool1 = false;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         k = compositeDecoder.decodeIntElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         m = compositeDecoder.decodeIntElement(serialDescriptor, 3);
/*    */         i |= 0x8;
/*    */         bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4);
/*    */         i |= 0x10;
/*    */       } else {
/*    */         while (bool) {
/*    */           int n = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (n) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               k = compositeDecoder.decodeIntElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               m = compositeDecoder.decodeIntElement(serialDescriptor, 3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 4);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(n);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new ABTestingStatus(i, str, j, k, m, bool1, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull ABTestingStatus value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       ABTestingStatus.write$Self$model_ab_testing(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.ab.ABTestingStatus", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("setupId", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("hashId", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("bucketId", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("groupId", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("optedOut", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/ab/ABTestingStatus$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/ab/ABTestingStatus;", "model-ab-testing"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<ABTestingStatus> serializer() {
/*    */       return (KSerializer<ABTestingStatus>)ABTestingStatus.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getSetupId() {
/*    */     return this.setupId;
/*    */   }
/*    */   
/*    */   public final int getHashId() {
/*    */     return this.hashId;
/*    */   }
/*    */   
/*    */   public final int getBucketId() {
/*    */     return this.bucketId;
/*    */   }
/*    */   
/*    */   public final int getGroupId() {
/*    */     return this.groupId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.setupId;
/*    */   }
/*    */   
/*    */   public final int component2() {
/*    */     return this.hashId;
/*    */   }
/*    */   
/*    */   public final int component3() {
/*    */     return this.bucketId;
/*    */   }
/*    */   
/*    */   public final int component4() {
/*    */     return this.groupId;
/*    */   }
/*    */   
/*    */   public final boolean component5() {
/*    */     return this.optedOut;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ABTestingStatus copy(@NotNull String setupId, int hashId, int bucketId, int groupId, boolean optedOut) {
/*    */     Intrinsics.checkNotNullParameter(setupId, "setupId");
/*    */     return new ABTestingStatus(setupId, hashId, bucketId, groupId, optedOut);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ABTestingStatus(setupId=" + this.setupId + ", hashId=" + this.hashId + ", bucketId=" + this.bucketId + ", groupId=" + this.groupId + ", optedOut=" + this.optedOut + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.setupId.hashCode();
/*    */     result = result * 31 + Integer.hashCode(this.hashId);
/*    */     result = result * 31 + Integer.hashCode(this.bucketId);
/*    */     result = result * 31 + Integer.hashCode(this.groupId);
/*    */     return result * 31 + Boolean.hashCode(this.optedOut);
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof ABTestingStatus))
/*    */       return false; 
/*    */     ABTestingStatus aBTestingStatus = (ABTestingStatus)other;
/*    */     return !Intrinsics.areEqual(this.setupId, aBTestingStatus.setupId) ? false : ((this.hashId != aBTestingStatus.hashId) ? false : ((this.bucketId != aBTestingStatus.bucketId) ? false : ((this.groupId != aBTestingStatus.groupId) ? false : (!(this.optedOut != aBTestingStatus.optedOut)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ab-testing-jvm-0.4.32.jar!\ai\grazie\model\ab\ABTestingStatus.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */