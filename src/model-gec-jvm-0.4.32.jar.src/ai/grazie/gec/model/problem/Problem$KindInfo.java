/*    */ package ai.grazie.gec.model.problem;
/*    */ 
/*    */ import ai.grazie.gec.model.CorrectionServiceType;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.EncodeDefault;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.CompositeDecoder;
/*    */ import kotlinx.serialization.encoding.CompositeEncoder;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\027\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 52\0020\001:\00245BW\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\013\022\n\b\001\020\r\032\004\030\0010\016\022\b\020\017\032\004\030\0010\020¢\006\002\020\021B;\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\n\b\002\020\f\032\004\030\0010\013\022\b\b\002\020\r\032\0020\016¢\006\002\020\022J\t\020 \032\0020\005HÆ\003J\t\020!\032\0020\007HÆ\003J\t\020\"\032\0020\tHÆ\003J\t\020#\032\0020\013HÆ\003J\013\020$\032\004\030\0010\013HÆ\003J\t\020%\032\0020\016HÆ\003JG\020&\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\n\b\002\020\f\032\004\030\0010\0132\b\b\002\020\r\032\0020\016HÆ\001J\023\020'\032\0020(2\b\020)\032\004\030\0010\001HÖ\003J\t\020*\032\0020\003HÖ\001J\t\020+\032\0020\013HÖ\001J&\020,\032\0020-2\006\020.\032\0020\0002\006\020/\032\002002\006\0201\032\00202HÁ\001¢\006\002\b3R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\023\020\024R\034\020\r\032\0020\0168\006X\004¢\006\016\n\000\022\004\b\025\020\026\032\004\b\027\020\030R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\031\020\032R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\033\020\034R\023\020\f\032\004\030\0010\013¢\006\b\n\000\032\004\b\035\020\032R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\036\020\037¨\0066"}, d2 = {"Lai/grazie/gec/model/problem/Problem$KindInfo;", "", "seen1", "", "id", "Lai/grazie/gec/model/problem/ProblemKindID;", "category", "Lai/grazie/gec/model/problem/Category;", "service", "Lai/grazie/gec/model/CorrectionServiceType;", "displayName", "", "ruleSettingsId", "confidence", "Lai/grazie/gec/model/problem/Problem$Confidence;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gec/model/problem/ProblemKindID;Lai/grazie/gec/model/problem/Category;Lai/grazie/gec/model/CorrectionServiceType;Ljava/lang/String;Ljava/lang/String;Lai/grazie/gec/model/problem/Problem$Confidence;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/gec/model/problem/ProblemKindID;Lai/grazie/gec/model/problem/Category;Lai/grazie/gec/model/CorrectionServiceType;Ljava/lang/String;Ljava/lang/String;Lai/grazie/gec/model/problem/Problem$Confidence;)V", "getCategory", "()Lai/grazie/gec/model/problem/Category;", "getConfidence$annotations", "()V", "getConfidence", "()Lai/grazie/gec/model/problem/Problem$Confidence;", "getDisplayName", "()Ljava/lang/String;", "getId", "()Lai/grazie/gec/model/problem/ProblemKindID;", "getRuleSettingsId", "getService", "()Lai/grazie/gec/model/CorrectionServiceType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "model-gec"})
/*    */ public final class KindInfo
/*    */ {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final ProblemKindID id;
/*    */   @NotNull
/*    */   private final Category category;
/*    */   @NotNull
/*    */   private final CorrectionServiceType service;
/*    */   @NotNull
/*    */   private final String displayName;
/*    */   @Nullable
/*    */   private final String ruleSettingsId;
/*    */   @NotNull
/*    */   private final Problem.Confidence confidence;
/*    */   
/*    */   public KindInfo(@NotNull ProblemKindID id, @NotNull Category category, @NotNull CorrectionServiceType service, @NotNull String displayName, @Nullable String ruleSettingsId, @NotNull Problem.Confidence confidence) {
/* 53 */     this.id = id;
/* 54 */     this.category = category;
/* 55 */     this.service = service;
/* 56 */     this.displayName = displayName;
/* 57 */     this.ruleSettingsId = ruleSettingsId;
/*    */     
/* 59 */     this.confidence = confidence; } @NotNull
/* 60 */   public final Problem.Confidence getConfidence() { return this.confidence; }
/*    */ 
/*    */   
/*    */   @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/Problem.KindInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/Problem$KindInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"})
/*    */   public static final class $serializer implements GeneratedSerializer<KindInfo> {
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
/*    */       KSerializer[] arrayOfKSerializer = new KSerializer[6];
/*    */       arrayOfKSerializer[0] = (KSerializer)ProblemKindID.Serializer.INSTANCE;
/*    */       arrayOfKSerializer[1] = (KSerializer)Category.Serializer.INSTANCE;
/*    */       arrayOfKSerializer[2] = (KSerializer)CorrectionServiceType.Serializer.INSTANCE;
/*    */       arrayOfKSerializer[3] = (KSerializer)StringSerializer.INSTANCE;
/*    */       arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE);
/*    */       arrayOfKSerializer[5] = (KSerializer)Problem.Confidence.Serializer.INSTANCE;
/*    */       return (KSerializer<?>[])arrayOfKSerializer;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public Problem.KindInfo deserialize(@NotNull Decoder decoder) {
/*    */       Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       boolean bool = true;
/*    */       int i = 0;
/*    */       ProblemKindID problemKindID = null;
/*    */       Category category = null;
/*    */       CorrectionServiceType correctionServiceType = null;
/*    */       String str1 = null, str2 = null;
/*    */       Problem.Confidence confidence = null;
/*    */       CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */       if (compositeDecoder.decodeSequentially()) {
/*    */         problemKindID = (ProblemKindID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemKindID.Serializer.INSTANCE, problemKindID);
/*    */         i |= 0x1;
/*    */         category = (Category)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Category.Serializer.INSTANCE, category);
/*    */         i |= 0x2;
/*    */         correctionServiceType = (CorrectionServiceType)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)CorrectionServiceType.Serializer.INSTANCE, correctionServiceType);
/*    */         i |= 0x4;
/*    */         str1 = compositeDecoder.decodeStringElement(serialDescriptor, 3);
/*    */         i |= 0x8;
/*    */         str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */         i |= 0x10;
/*    */         confidence = (Problem.Confidence)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)Problem.Confidence.Serializer.INSTANCE, confidence);
/*    */         i |= 0x20;
/*    */       } else {
/*    */         while (bool) {
/*    */           int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */           switch (j) {
/*    */             case -1:
/*    */               bool = false;
/*    */               continue;
/*    */             case 0:
/*    */               problemKindID = (ProblemKindID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemKindID.Serializer.INSTANCE, problemKindID);
/*    */               i |= 0x1;
/*    */               continue;
/*    */             case 1:
/*    */               category = (Category)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Category.Serializer.INSTANCE, category);
/*    */               i |= 0x2;
/*    */               continue;
/*    */             case 2:
/*    */               correctionServiceType = (CorrectionServiceType)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)CorrectionServiceType.Serializer.INSTANCE, correctionServiceType);
/*    */               i |= 0x4;
/*    */               continue;
/*    */             case 3:
/*    */               str1 = compositeDecoder.decodeStringElement(serialDescriptor, 3);
/*    */               i |= 0x8;
/*    */               continue;
/*    */             case 4:
/*    */               str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str2);
/*    */               i |= 0x10;
/*    */               continue;
/*    */             case 5:
/*    */               confidence = (Problem.Confidence)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)Problem.Confidence.Serializer.INSTANCE, confidence);
/*    */               i |= 0x20;
/*    */               continue;
/*    */           } 
/*    */           throw new UnknownFieldException(j);
/*    */         } 
/*    */       } 
/*    */       compositeDecoder.endStructure(serialDescriptor);
/*    */       return new Problem.KindInfo(i, problemKindID, category, correctionServiceType, str1, str2, confidence, null);
/*    */     }
/*    */     
/*    */     public void serialize(@NotNull Encoder encoder, @NotNull Problem.KindInfo value) {
/*    */       Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */       Intrinsics.checkNotNullParameter(value, "value");
/*    */       SerialDescriptor serialDescriptor = getDescriptor();
/*    */       CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */       Problem.KindInfo.write$Self$model_gec(value, compositeEncoder, serialDescriptor);
/*    */       compositeEncoder.endStructure(serialDescriptor);
/*    */     }
/*    */     
/*    */     static {
/*    */       PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.problem.Problem.KindInfo", INSTANCE, 6);
/*    */       pluginGeneratedSerialDescriptor.addElement("id", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("category", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("service", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("displayName", false);
/*    */       pluginGeneratedSerialDescriptor.addElement("ruleSettingsId", true);
/*    */       pluginGeneratedSerialDescriptor.addElement("confidence", true);
/*    */       descriptor = pluginGeneratedSerialDescriptor;
/*    */     }
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/Problem$KindInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/Problem$KindInfo;", "model-gec"})
/*    */   public static final class Companion {
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<Problem.KindInfo> serializer() {
/*    */       return (KSerializer<Problem.KindInfo>)Problem.KindInfo.$serializer.INSTANCE;
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ProblemKindID getId() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Category getCategory() {
/*    */     return this.category;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CorrectionServiceType getService() {
/*    */     return this.service;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String getDisplayName() {
/*    */     return this.displayName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String getRuleSettingsId() {
/*    */     return this.ruleSettingsId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ProblemKindID component1() {
/*    */     return this.id;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Category component2() {
/*    */     return this.category;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final CorrectionServiceType component3() {
/*    */     return this.service;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component4() {
/*    */     return this.displayName;
/*    */   }
/*    */   
/*    */   @Nullable
/*    */   public final String component5() {
/*    */     return this.ruleSettingsId;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Problem.Confidence component6() {
/*    */     return this.confidence;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final KindInfo copy(@NotNull ProblemKindID id, @NotNull Category category, @NotNull CorrectionServiceType service, @NotNull String displayName, @Nullable String ruleSettingsId, @NotNull Problem.Confidence confidence) {
/*    */     Intrinsics.checkNotNullParameter(id, "id");
/*    */     Intrinsics.checkNotNullParameter(category, "category");
/*    */     Intrinsics.checkNotNullParameter(service, "service");
/*    */     Intrinsics.checkNotNullParameter(displayName, "displayName");
/*    */     Intrinsics.checkNotNullParameter(confidence, "confidence");
/*    */     return new KindInfo(id, category, service, displayName, ruleSettingsId, confidence);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "KindInfo(id=" + this.id + ", category=" + this.category + ", service=" + this.service + ", displayName=" + this.displayName + ", ruleSettingsId=" + this.ruleSettingsId + ", confidence=" + this.confidence + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     result = this.id.hashCode();
/*    */     result = result * 31 + this.category.hashCode();
/*    */     result = result * 31 + this.service.hashCode();
/*    */     result = result * 31 + this.displayName.hashCode();
/*    */     result = result * 31 + ((this.ruleSettingsId == null) ? 0 : this.ruleSettingsId.hashCode());
/*    */     return result * 31 + this.confidence.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof KindInfo))
/*    */       return false; 
/*    */     KindInfo kindInfo = (KindInfo)other;
/*    */     return !Intrinsics.areEqual(this.id, kindInfo.id) ? false : ((this.category != kindInfo.category) ? false : ((this.service != kindInfo.service) ? false : (!Intrinsics.areEqual(this.displayName, kindInfo.displayName) ? false : (!Intrinsics.areEqual(this.ruleSettingsId, kindInfo.ruleSettingsId) ? false : (!(this.confidence != kindInfo.confidence))))));
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\Problem$KindInfo.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */