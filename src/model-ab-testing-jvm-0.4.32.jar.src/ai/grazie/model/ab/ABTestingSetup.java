/*    */ package ai.grazie.model.ab;
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\002\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\r\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 %2\0020\001:\002$%B[\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\t\022\016\020\013\032\n\022\004\022\0020\r\030\0010\f\022\b\020\016\032\004\030\0010\017¢\006\002\020\020B;\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\005\022\006\020\b\032\0020\t\022\006\020\n\032\0020\t\022\f\020\013\032\b\022\004\022\0020\r0\f¢\006\002\020\021J&\020\034\032\0020\0352\006\020\036\032\0020\0002\006\020\037\032\0020 2\006\020!\032\0020\"HÁ\001¢\006\002\b#R\021\020\n\032\0020\t¢\006\b\n\000\032\004\b\022\020\023R\031\020\013\032\b\022\004\022\0020\r0\f¢\006\n\n\002\020\026\032\004\b\024\020\025R\021\020\007\032\0020\005¢\006\b\n\000\032\004\b\027\020\030R\021\020\006\032\0020\005¢\006\b\n\000\032\004\b\031\020\030R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\032\020\030R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\033\020\023¨\006&"}, d2 = {"Lai/grazie/model/ab/ABTestingSetup;", "", "seen1", "", "salt", "", "name", "link", "startDate", "Lai/grazie/utils/mpp/time/Timestamp;", "endDate", "groups", "", "Lai/grazie/model/ab/ABGroup;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/time/Timestamp;[Lai/grazie/model/ab/ABGroup;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/grazie/utils/mpp/time/Timestamp;Lai/grazie/utils/mpp/time/Timestamp;[Lai/grazie/model/ab/ABGroup;)V", "getEndDate", "()Lai/grazie/utils/mpp/time/Timestamp;", "getGroups", "()[Lai/grazie/model/ab/ABGroup;", "[Lai/grazie/model/ab/ABGroup;", "getLink", "()Ljava/lang/String;", "getName", "getSalt", "getStartDate", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_ab_testing", "$serializer", "Companion", "model-ab-testing"})
/*    */ public final class ABTestingSetup {
/*    */   @NotNull
/* 22 */   public static final Companion Companion = new Companion(null); @NotNull
/*    */   private final String salt; @NotNull
/*    */   private final String name; @NotNull
/* 25 */   private final String link; public ABTestingSetup(@NotNull String salt, @NotNull String name, @NotNull String link, @NotNull Timestamp startDate, @NotNull Timestamp endDate, @NotNull ABGroup[] groups) { this.salt = salt;
/* 26 */     this.name = name;
/* 27 */     this.link = link;
/* 28 */     this.startDate = startDate;
/* 29 */     this.endDate = endDate;
/* 30 */     this.groups = groups; } @NotNull private final Timestamp startDate; @NotNull private final Timestamp endDate; @NotNull private final ABGroup[] groups; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; @NotNull public final ABGroup[] getGroups() { return this.groups; }
/*    */ 
/*    */   
/*    */   static {
/*    */     KSerializer[] arrayOfKSerializer = new KSerializer[6];
/*    */     arrayOfKSerializer[0] = null;
/*    */     arrayOfKSerializer[1] = null;
/*    */     arrayOfKSerializer[2] = null;
/*    */     arrayOfKSerializer[3] = null;
/*    */     arrayOfKSerializer[4] = null;
/*    */     arrayOfKSerializer[5] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(ABGroup.class), (KSerializer)ABGroup.$serializer.INSTANCE);
/*    */     $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*    */   }
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/ab/ABTestingSetup.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/ab/ABTestingSetup;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-ab-testing"})
/*    */   public static final class $serializer implements GeneratedSerializer<ABTestingSetup> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])ABTestingSetup.$childSerializers, arrayOfKSerializer2 = new KSerializer[6];
/*    */       arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer2[3] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*    */       arrayOfKSerializer2[4] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*    */       arrayOfKSerializer2[5] = arrayOfKSerializer1[5];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public ABTestingSetup deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null, str2 = null, str3 = null;
/*    */       Timestamp timestamp1 = null, timestamp2 = null;
/*    */       ABGroup[] arrayOfABGroup = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])ABTestingSetup.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         timestamp1 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp1);
/*    */         i |= 0x8;
/*    */         timestamp2 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp2);
/*    */         i |= 0x10;
/*    */         arrayOfABGroup = (ABGroup[])compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)arrayOfKSerializer[5], arrayOfABGroup);
/*    */         i |= 0x20;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               str3 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               timestamp1 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp1);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               timestamp2 = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 4, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp2);
/*    */               i |= 0x10;
/*    */               continue;
/*    */             case 5:
/*    */               arrayOfABGroup = (ABGroup[])compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)arrayOfKSerializer[5], arrayOfABGroup);
/*    */               i |= 0x20;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new ABTestingSetup(i, str1, str2, str3, timestamp1, timestamp2, arrayOfABGroup, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull ABTestingSetup value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       ABTestingSetup.write$Self$model_ab_testing(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.ab.ABTestingSetup", INSTANCE, 6);
/*    */       pluginGeneratedSerialDescriptor.addElement("salt", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("name", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("link", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("startDate", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("endDate", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("groups", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/ab/ABTestingSetup$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/ab/ABTestingSetup;", "model-ab-testing"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<ABTestingSetup> serializer() {
/*    */       return (KSerializer<ABTestingSetup>)ABTestingSetup.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getSalt() {
/*    */     return this.salt;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getName() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getLink() {
/*    */     return this.link;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp getStartDate() {
/*    */     return this.startDate;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Timestamp getEndDate() {
/*    */     return this.endDate;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ab-testing-jvm-0.4.32.jar!\ai\grazie\model\ab\ABTestingSetup.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */