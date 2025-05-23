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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\020\016\n\000\n\002\020\013\n\002\b\003\n\002\030\002\n\002\b\n\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0372\0020\001:\002\036\037BC\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\020\005\032\004\030\0010\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\003\022\006\020\n\032\0020\003\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB-\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006\022\006\020\007\032\0020\b\022\006\020\t\032\0020\003\022\006\020\n\032\0020\003¢\006\002\020\016J&\020\026\032\0020\0272\006\020\030\032\0020\0002\006\020\031\032\0020\0322\006\020\033\032\0020\034HÁ\001¢\006\002\b\035R\021\020\t\032\0020\003¢\006\b\n\000\032\004\b\017\020\020R\021\020\n\032\0020\003¢\006\b\n\000\032\004\b\021\020\020R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\022\020\023R\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\024\020\020R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\007\020\025¨\006 "}, d2 = {"Lai/grazie/model/ab/ABGroup;", "", "seen1", "", "id", "description", "", "isControl", "", "bucketsFrom", "bucketsTo", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILjava/lang/String;ZIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILjava/lang/String;ZII)V", "getBucketsFrom", "()I", "getBucketsTo", "getDescription", "()Ljava/lang/String;", "getId", "()Z", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_ab_testing", "$serializer", "Companion", "model-ab-testing"})
/*    */ public final class ABGroup
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   private final int id;
/*    */   @NotNull
/*    */   private final String description;
/*    */   private final boolean isControl;
/*    */   private final int bucketsFrom;
/*    */   private final int bucketsTo;
/*    */   
/*    */   public ABGroup(int id, @NotNull String description, boolean isControl, int bucketsFrom, int bucketsTo) {
/* 46 */     this.id = id;
/* 47 */     this.description = description;
/* 48 */     this.isControl = isControl;
/* 49 */     this.bucketsFrom = bucketsFrom;
/* 50 */     this.bucketsTo = bucketsTo; } public final int getBucketsTo() { return this.bucketsTo; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/ab/ABGroup.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/ab/ABGroup;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-ab-testing"})
/*    */   public static final class $serializer implements GeneratedSerializer<ABGroup> {
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
/*    */       arrayOfKSerializer[0] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)BooleanSerializer.INSTANCE;
/*    */       arrayOfKSerializer[3] = (KSerializer)IntSerializer.INSTANCE;
/*    */       arrayOfKSerializer[4] = (KSerializer)IntSerializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public ABGroup deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0, j = 0;
/*    */       String str = null;
/*    */       boolean bool1 = false;
/*    */       int k = 0, m = 0;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
/*    */         i |= 0x1;
/*    */         str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */         i |= 0x2;
/*    */         bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 2);
/*    */         i |= 0x4;
/*    */         k = compositeDecoder.decodeIntElement(serialDescriptor, 3);
/*    */         i |= 0x8;
/*    */         m = compositeDecoder.decodeIntElement(serialDescriptor, 4);
/*    */         i |= 0x10;
/*    */       } else {
/*    */         while (bool) {
/*    */           int n = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (n) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 2);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               k = compositeDecoder.decodeIntElement(serialDescriptor, 3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               m = compositeDecoder.decodeIntElement(serialDescriptor, 4);
/*    */               i |= 0x10;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(n);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new ABGroup(i, j, str, bool1, k, m, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull ABGroup value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       ABGroup.write$Self$model_ab_testing(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.ab.ABGroup", INSTANCE, 5);
/*    */       pluginGeneratedSerialDescriptor.addElement("id", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("description", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("isControl", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("bucketsFrom", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("bucketsTo", false);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/ab/ABGroup$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/ab/ABGroup;", "model-ab-testing"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<ABGroup> serializer() {
/*    */       return (KSerializer<ABGroup>)ABGroup.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   public final int getId() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDescription() {
/*    */     return this.description;
/*    */   }
/*    */   
/*    */   public final boolean isControl() {
/*    */     return this.isControl;
/*    */   }
/*    */   
/*    */   public final int getBucketsFrom() {
/*    */     return this.bucketsFrom;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-ab-testing-jvm-0.4.32.jar!\ai\grazie\model\ab\ABGroup.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */