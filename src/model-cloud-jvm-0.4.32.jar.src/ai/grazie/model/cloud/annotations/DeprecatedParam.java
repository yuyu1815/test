/*    */ package ai.grazie.model.cloud.annotations;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*    */ import kotlinx.serialization.internal.StringSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\021\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 -2\0020\001:\002,-BU\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\005\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\r¢\006\002\020\016B7\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\005\022\b\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\005¢\006\002\020\017J\013\020\030\032\004\030\0010\005HÆ\003J\013\020\031\032\004\030\0010\005HÆ\003J\013\020\032\032\004\030\0010\005HÆ\003J\013\020\033\032\004\030\0010\005HÆ\003J\013\020\034\032\004\030\0010\005HÆ\003JE\020\035\032\0020\0002\n\b\002\020\004\032\004\030\0010\0052\n\b\002\020\006\032\004\030\0010\0052\n\b\002\020\007\032\004\030\0010\0052\n\b\002\020\b\032\004\030\0010\0052\n\b\002\020\t\032\004\030\0010\005HÆ\001J\023\020\036\032\0020\0372\b\020 \032\004\030\0010!HÖ\003J\t\020\"\032\0020\003HÖ\001J\t\020#\032\0020\005HÖ\001J&\020$\032\0020%2\006\020&\032\0020\0002\006\020'\032\0020(2\006\020)\032\0020*HÁ\001¢\006\002\b+R\024\020\n\032\0020\013X\004¢\006\b\n\000\032\004\b\020\020\021R\023\020\004\032\004\030\0010\005¢\006\b\n\000\032\004\b\022\020\023R\023\020\b\032\004\030\0010\005¢\006\b\n\000\032\004\b\024\020\023R\023\020\006\032\004\030\0010\005¢\006\b\n\000\032\004\b\025\020\023R\023\020\007\032\004\030\0010\005¢\006\b\n\000\032\004\b\026\020\023R\023\020\t\032\004\030\0010\005¢\006\b\n\000\032\004\b\027\020\023¨\006."}, d2 = {"Lai/grazie/model/cloud/annotations/DeprecatedParam;", "Lai/grazie/model/cloud/annotations/AnnotationInfo;", "seen1", "", "apiQualifiedName", "", "paramName", "paramQualifiedName", "deprecationMessage", "replaceWithExpression", "annotationType", "Lai/grazie/model/cloud/annotations/AnnotationType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lai/grazie/model/cloud/annotations/AnnotationType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAnnotationType", "()Lai/grazie/model/cloud/annotations/AnnotationType;", "getApiQualifiedName", "()Ljava/lang/String;", "getDeprecationMessage", "getParamName", "getParamQualifiedName", "getReplaceWithExpression", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_cloud", "$serializer", "Companion", "model-cloud"})
/*    */ public final class DeprecatedParam implements AnnotationInfo {
/*    */   @Nullable
/*    */   private final String apiQualifiedName;
/*    */   @Nullable
/*    */   private final String paramName;
/*    */   @Nullable
/*    */   private final String paramQualifiedName;
/*    */   @Nullable
/*    */   private final String deprecationMessage;
/*    */   @NotNull
/* 25 */   public static final Companion Companion = new Companion(null); @Nullable private final String replaceWithExpression; @NotNull private final AnnotationType annotationType; @JvmField
/*    */   @NotNull
/* 27 */   private static final KSerializer<Object>[] $childSerializers; public DeprecatedParam(@Nullable String apiQualifiedName, @Nullable String paramName, @Nullable String paramQualifiedName, @Nullable String deprecationMessage, @Nullable String replaceWithExpression) { this.apiQualifiedName = apiQualifiedName;
/* 28 */     this.paramName = paramName;
/* 29 */     this.paramQualifiedName = paramQualifiedName;
/* 30 */     this.deprecationMessage = deprecationMessage;
/* 31 */     this.replaceWithExpression = replaceWithExpression;
/*    */     
/* 33 */     this.annotationType = AnnotationType.DEPRECATED_PARAM; } static { KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = null; arrayOfKSerializer[4] = null; arrayOfKSerializer[5] = AnnotationType.Companion.serializer(); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @NotNull public AnnotationType getAnnotationType() { return this.annotationType; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/model/cloud/annotations/DeprecatedParam.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/model/cloud/annotations/DeprecatedParam;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-cloud"})
/*    */   public static final class $serializer implements GeneratedSerializer<DeprecatedParam> {
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
/*    */       KSerializer[] arrayOfKSerializer1 = (KSerializer[])DeprecatedParam.$childSerializers, arrayOfKSerializer2 = new KSerializer[6];
/*    */       arrayOfKSerializer2[0] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[3] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer2[5] = arrayOfKSerializer1[5];
/*    */       return (KSerializer<?>[])arrayOfKSerializer2;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public DeprecatedParam deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       String str1 = null, str2 = null, str3 = null, str4 = null, str5 = null;
/*    */       AnnotationType annotationType = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       KSerializer[] arrayOfKSerializer = (KSerializer[])DeprecatedParam.$childSerializers;
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StringSerializer.INSTANCE, str1);
/*    */         i |= 0x1;
/*    */         str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */         i |= 0x2;
/*    */         str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str3);
/*    */         i |= 0x4;
/*    */         str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*    */         i |= 0x8;
/*    */         str5 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str5);
/*    */         i |= 0x10;
/*    */         annotationType = (AnnotationType)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)arrayOfKSerializer[5], annotationType);
/*    */         i |= 0x20;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 0, (DeserializationStrategy)StringSerializer.INSTANCE, str1);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               str3 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str3);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               str4 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, str4);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               str5 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str5);
/*    */               i |= 0x10;
/*    */               continue;
/*    */             case 5:
/*    */               annotationType = (AnnotationType)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)arrayOfKSerializer[5], annotationType);
/*    */               i |= 0x20;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new DeprecatedParam(i, str1, str2, str3, str4, str5, annotationType, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull DeprecatedParam value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       DeprecatedParam.write$Self$model_cloud(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.model.cloud.annotations.DeprecatedParam", INSTANCE, 6);
/*    */       pluginGeneratedSerialDescriptor.addElement("apiQualifiedName", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("paramName", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("paramQualifiedName", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("deprecationMessage", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("replaceWithExpression", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("annotationType", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/model/cloud/annotations/DeprecatedParam$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/cloud/annotations/DeprecatedParam;", "model-cloud"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<DeprecatedParam> serializer() {
/*    */       return (KSerializer<DeprecatedParam>)DeprecatedParam.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getApiQualifiedName() {
/*    */     return this.apiQualifiedName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getParamName() {
/*    */     return this.paramName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getParamQualifiedName() {
/*    */     return this.paramQualifiedName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getDeprecationMessage() {
/*    */     return this.deprecationMessage;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getReplaceWithExpression() {
/*    */     return this.replaceWithExpression;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component1() {
/*    */     return this.apiQualifiedName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component2() {
/*    */     return this.paramName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component3() {
/*    */     return this.paramQualifiedName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component4() {
/*    */     return this.deprecationMessage;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component5() {
/*    */     return this.replaceWithExpression;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final DeprecatedParam copy(@Nullable String apiQualifiedName, @Nullable String paramName, @Nullable String paramQualifiedName, @Nullable String deprecationMessage, @Nullable String replaceWithExpression) {
/*    */     return new DeprecatedParam(apiQualifiedName, paramName, paramQualifiedName, deprecationMessage, replaceWithExpression);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "DeprecatedParam(apiQualifiedName=" + this.apiQualifiedName + ", paramName=" + this.paramName + ", paramQualifiedName=" + this.paramQualifiedName + ", deprecationMessage=" + this.deprecationMessage + ", replaceWithExpression=" + this.replaceWithExpression + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = (this.apiQualifiedName == null) ? 0 : this.apiQualifiedName.hashCode();
/*    */     result = result * 31 + ((this.paramName == null) ? 0 : this.paramName.hashCode());
/*    */     result = result * 31 + ((this.paramQualifiedName == null) ? 0 : this.paramQualifiedName.hashCode());
/*    */     result = result * 31 + ((this.deprecationMessage == null) ? 0 : this.deprecationMessage.hashCode());
/*    */     return result * 31 + ((this.replaceWithExpression == null) ? 0 : this.replaceWithExpression.hashCode());
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof DeprecatedParam))
/*    */       return false; 
/*    */     DeprecatedParam deprecatedParam = (DeprecatedParam)other;
/*    */     return !Intrinsics.areEqual(this.apiQualifiedName, deprecatedParam.apiQualifiedName) ? false : (!Intrinsics.areEqual(this.paramName, deprecatedParam.paramName) ? false : (!Intrinsics.areEqual(this.paramQualifiedName, deprecatedParam.paramQualifiedName) ? false : (!Intrinsics.areEqual(this.deprecationMessage, deprecatedParam.deprecationMessage) ? false : (!!Intrinsics.areEqual(this.replaceWithExpression, deprecatedParam.replaceWithExpression)))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-cloud-jvm-0.4.32.jar!\ai\grazie\model\cloud\annotations\DeprecatedParam.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */