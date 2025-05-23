/*    */ package ai.grazie.quota;
/*    */ 
/*    */ import ai.grazie.utils.mpp.money.Credit;
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\f\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 %2\0020\001:\002$%B7\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\035\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\005¢\006\002\020\fJ\t\020\022\032\0020\005HÆ\003J\t\020\023\032\0020\007HÆ\003J\t\020\024\032\0020\005HÆ\003J'\020\025\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\005HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\003HÖ\001J\t\020\032\032\0020\033HÖ\001J&\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"HÁ\001¢\006\002\b#R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\017\020\020R\021\020\b\032\0020\005¢\006\b\n\000\032\004\b\021\020\016¨\006&"}, d2 = {"Lai/grazie/quota/QuotaExtension;", "", "seen1", "", "created", "Lai/grazie/utils/mpp/time/Timestamp;", "credits", "Lai/grazie/utils/mpp/money/Credit;", "until", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/time/Timestamp;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/money/Credit;Lai/grazie/utils/mpp/time/Timestamp;)V", "getCreated", "()Lai/grazie/utils/mpp/time/Timestamp;", "getCredits", "()Lai/grazie/utils/mpp/money/Credit;", "getUntil", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_quota", "$serializer", "Companion", "model-quota"})
/*    */ public final class QuotaExtension {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final Timestamp created;
/*    */   
/* 19 */   public QuotaExtension(@NotNull Timestamp created, @NotNull Credit credits, @NotNull Timestamp until) { this.created = created;
/* 20 */     this.credits = credits;
/* 21 */     this.until = until; } @NotNull private final Credit credits; @NotNull private final Timestamp until; @NotNull public final Timestamp getUntil() { return this.until; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/quota/QuotaExtension.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/quota/QuotaExtension;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-quota"})
/*    */   public static final class $serializer implements GeneratedSerializer<QuotaExtension> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*    */       arrayOfKSerializer[0] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)Credit$.serializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public QuotaExtension deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       Timestamp timestamp1 = null;
/*    */       Credit credit = null;
/*    */       Timestamp timestamp2 = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         timestamp1 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp1);
/*    */         i |= 0x1;
/*    */         credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit);
/*    */         i |= 0x2;
/*    */         timestamp2 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp2);
/*    */         i |= 0x4;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               timestamp1 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp1);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               credit = (Credit)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Credit$.serializer.INSTANCE, credit);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               timestamp2 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new QuotaExtension(i, timestamp1, credit, timestamp2, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull QuotaExtension value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       QuotaExtension.write$Self$model_quota(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.quota.QuotaExtension", INSTANCE, 3);
/*    */       pluginGeneratedSerialDescriptor.addElement("created", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("credits", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("until", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/quota/QuotaExtension$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/quota/QuotaExtension;", "model-quota"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<QuotaExtension> serializer() {
/*    */       return (KSerializer<QuotaExtension>)QuotaExtension.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp getCreated() {
/*    */     return this.created;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Credit getCredits() {
/*    */     return this.credits;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp component1() {
/*    */     return this.created;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Credit component2() {
/*    */     return this.credits;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp component3() {
/*    */     return this.until;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final QuotaExtension copy(@NotNull Timestamp created, @NotNull Credit credits, @NotNull Timestamp until) {
/*    */     Intrinsics.checkNotNullParameter(created, "created");
/*    */     Intrinsics.checkNotNullParameter(credits, "credits");
/*    */     Intrinsics.checkNotNullParameter(until, "until");
/*    */     return new QuotaExtension(created, credits, until);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "QuotaExtension(created=" + this.created + ", credits=" + this.credits + ", until=" + this.until + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.created.hashCode();
/*    */     result = result * 31 + this.credits.hashCode();
/*    */     return result * 31 + this.until.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof QuotaExtension))
/*    */       return false; 
/*    */     QuotaExtension quotaExtension = (QuotaExtension)other;
/*    */     return !Intrinsics.areEqual(this.created, quotaExtension.created) ? false : (!Intrinsics.areEqual(this.credits, quotaExtension.credits) ? false : (!!Intrinsics.areEqual(this.until, quotaExtension.until)));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-quota-jvm-0.4.32.jar!\ai\grazie\quota\QuotaExtension.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */