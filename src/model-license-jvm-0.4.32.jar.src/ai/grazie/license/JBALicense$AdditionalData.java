/*    */ package ai.grazie.license;
/*    */ 
/*    */ import ai.grazie.utils.mpp.time.Timestamp;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.DeprecationLevel;
/*    */ import kotlin.Lazy;
/*    */ import kotlin.LazyKt;
/*    */ import kotlin.LazyThreadSafetyMode;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.functions.Function0;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.Lambda;
/*    */ import kotlin.jvm.internal.Reflection;
/*    */ import kotlin.reflect.KClass;
/*    */ import kotlinx.serialization.DeserializationStrategy;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.SealedClassSerializer;
/*    */ import kotlinx.serialization.SerialName;
/*    */ import kotlinx.serialization.Serializable;
/*    */ import kotlinx.serialization.SerializationStrategy;
/*    */ import kotlinx.serialization.UnknownFieldException;
/*    */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
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
/*    */ @Serializable
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\b7\030\000 \0172\0020\001:\002\017\020B\031\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\002\020\006B\007\b\004¢\006\002\020\007J!\020\b\032\0020\t2\006\020\n\032\0020\0002\006\020\013\032\0020\f2\006\020\r\032\0020\016HÇ\001\001\001\021¨\006\022"}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Companion", "IDESAdditionalData", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData;", "model-license"})
/*    */ public abstract class AdditionalData
/*    */ {
/*    */   @NotNull
/* 74 */   public static final Companion Companion = new Companion(null); @NotNull private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE); private AdditionalData() {} @Metadata(mv = {1, 7, 0}, k = 3, xi = 48) static final class null extends Lambda implements Function0<KSerializer<Object>> { public static final null INSTANCE = (null)new Function0<>(); null() { super(0); } public final KSerializer<Object> invoke() { KClass[] arrayOfKClass = new KClass[1]; arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(JBALicense.AdditionalData.IDESAdditionalData.class); KSerializer[] arrayOfKSerializer = new KSerializer[1]; arrayOfKSerializer[0] = (KSerializer)JBALicense.AdditionalData.IDESAdditionalData.$serializer.INSTANCE; return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.license.JBALicense.AdditionalData", Reflection.getOrCreateKotlinClass(JBALicense.AdditionalData.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]); } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/license/JBALicense$AdditionalData;", "model-license"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<JBALicense.AdditionalData> serializer() { return get$cachedSerializer(); } } @Serializable @SerialName("IDES") @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\013\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\020\n\002\020\000\n\002\b\002\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 (2\0020\001:\003'()B5\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\003\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B#\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\003\022\n\b\002\020\007\032\004\030\0010\b¢\006\002\020\fJ\t\020\024\032\0020\005HÆ\003J\020\020\025\032\004\030\0010\003HÆ\003¢\006\002\020\020J\013\020\026\032\004\030\0010\bHÆ\003J0\020\027\032\0020\0002\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\0032\n\b\002\020\007\032\004\030\0010\bHÆ\001¢\006\002\020\030J\023\020\031\032\0020\0052\b\020\032\032\004\030\0010\033HÖ\003J\t\020\034\032\0020\003HÖ\001J\t\020\035\032\0020\036HÖ\001J&\020\037\032\0020 2\006\020!\032\0020\0002\006\020\"\032\0020#2\006\020$\032\0020%HÁ\001¢\006\002\b&R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016R\025\020\006\032\004\030\0010\003¢\006\n\n\002\020\021\032\004\b\017\020\020R\023\020\007\032\004\030\0010\b¢\006\b\n\000\032\004\b\022\020\023¨\006*"}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData;", "Lai/grazie/license/JBALicense$AdditionalData;", "seen1", "", "aiEnabled", "", "prepaidUsers", "trialInfo", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/Integer;Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZLjava/lang/Integer;Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;)V", "getAiEnabled", "()Z", "getPrepaidUsers", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrialInfo", "()Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "component1", "component2", "component3", "copy", "(ZLjava/lang/Integer;Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;)Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData;", "equals", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_license", "$serializer", "Companion", "TrialInfo", "model-license"}) public static final class IDESAdditionalData extends AdditionalData { @NotNull public static final Companion Companion = new Companion(null); private final boolean aiEnabled; @Nullable private final Integer prepaidUsers; @Nullable private final TrialInfo trialInfo; @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/license/JBALicense.AdditionalData.IDESAdditionalData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-license"})
/*    */     public static final class $serializer implements GeneratedSerializer<IDESAdditionalData> { @NotNull
/* 76 */       public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)BooleanSerializer.INSTANCE; arrayOfKSerializer[1] = BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE); arrayOfKSerializer[2] = BuiltinSerializersKt.getNullable((KSerializer)JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.$serializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public JBALicense.AdditionalData.IDESAdditionalData deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; boolean bool1 = false; Integer integer = null; JBALicense.AdditionalData.IDESAdditionalData.TrialInfo trialInfo = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0); i |= 0x1; integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)IntSerializer.INSTANCE, integer); i |= 0x2; trialInfo = (JBALicense.AdditionalData.IDESAdditionalData.TrialInfo)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.$serializer.INSTANCE, trialInfo); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: bool1 = compositeDecoder.decodeBooleanElement(serialDescriptor, 0); i |= 0x1; continue;case 1: integer = (Integer)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)IntSerializer.INSTANCE, integer); i |= 0x2; continue;case 2: trialInfo = (JBALicense.AdditionalData.IDESAdditionalData.TrialInfo)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.$serializer.INSTANCE, trialInfo); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new JBALicense.AdditionalData.IDESAdditionalData(i, bool1, integer, trialInfo, null); } public void serialize(@NotNull Encoder encoder, @NotNull JBALicense.AdditionalData.IDESAdditionalData value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); JBALicense.AdditionalData.IDESAdditionalData.write$Self$model_license(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("IDES", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("aiEnabled", false); pluginGeneratedSerialDescriptor.addElement("prepaidUsers", false); pluginGeneratedSerialDescriptor.addElement("trialInfo", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData;", "model-license"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<JBALicense.AdditionalData.IDESAdditionalData> serializer() { return (KSerializer<JBALicense.AdditionalData.IDESAdditionalData>)JBALicense.AdditionalData.IDESAdditionalData.$serializer.INSTANCE; }
/*    */        }
/*    */     
/* 79 */     public final boolean getAiEnabled() { return this.aiEnabled; } @Nullable
/* 80 */     public final Integer getPrepaidUsers() { return this.prepaidUsers; } @Nullable
/* 81 */     public final TrialInfo getTrialInfo() { return this.trialInfo; }
/* 82 */     public final boolean component1() { return this.aiEnabled; } @Nullable public final Integer component2() { return this.prepaidUsers; } @Nullable public final TrialInfo component3() { return this.trialInfo; } @NotNull public final IDESAdditionalData copy(boolean aiEnabled, @Nullable Integer prepaidUsers, @Nullable TrialInfo trialInfo) { return new IDESAdditionalData(aiEnabled, prepaidUsers, trialInfo); } public IDESAdditionalData(boolean aiEnabled, @Nullable Integer prepaidUsers, @Nullable TrialInfo trialInfo) { super(null); this.aiEnabled = aiEnabled; this.prepaidUsers = prepaidUsers; this.trialInfo = trialInfo; }
/*    */     @NotNull public String toString() { return "IDESAdditionalData(aiEnabled=" + this.aiEnabled + ", prepaidUsers=" + this.prepaidUsers + ", trialInfo=" + this.trialInfo + ")"; } public int hashCode() { result = Boolean.hashCode(this.aiEnabled); result = result * 31 + ((this.prepaidUsers == null) ? 0 : this.prepaidUsers.hashCode()); return result * 31 + ((this.trialInfo == null) ? 0 : this.trialInfo.hashCode()); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof IDESAdditionalData))
/*    */         return false;  IDESAdditionalData iDESAdditionalData = (IDESAdditionalData)other; return (this.aiEnabled != iDESAdditionalData.aiEnabled) ? false : (!Intrinsics.areEqual(this.prepaidUsers, iDESAdditionalData.prepaidUsers) ? false : (!!Intrinsics.areEqual(this.trialInfo, iDESAdditionalData.trialInfo))); } @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 !2\0020\001:\002 !B+\b\021\022\006\020\002\032\0020\003\022\006\020\004\032\0020\003\022\b\020\005\032\004\030\0010\006\022\b\020\007\032\004\030\0010\b¢\006\002\020\tB\025\022\006\020\004\032\0020\003\022\006\020\005\032\0020\006¢\006\002\020\nJ\t\020\017\032\0020\003HÆ\003J\t\020\020\032\0020\006HÆ\003J\035\020\021\032\0020\0002\b\b\002\020\004\032\0020\0032\b\b\002\020\005\032\0020\006HÆ\001J\023\020\022\032\0020\0232\b\020\024\032\004\030\0010\001HÖ\003J\t\020\025\032\0020\003HÖ\001J\t\020\026\032\0020\027HÖ\001J&\020\030\032\0020\0312\006\020\032\032\0020\0002\006\020\033\032\0020\0342\006\020\035\032\0020\036HÁ\001¢\006\002\b\037R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\003¢\006\b\n\000\032\004\b\r\020\016¨\006\""}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "", "seen1", "", "usersLimit", "till", "Lai/grazie/utils/mpp/time/Timestamp;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IILai/grazie/utils/mpp/time/Timestamp;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ILai/grazie/utils/mpp/time/Timestamp;)V", "getTill", "()Lai/grazie/utils/mpp/time/Timestamp;", "getUsersLimit", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_license", "$serializer", "Companion", "model-license"}) public static final class TrialInfo
/*    */     {
/* 86 */       @NotNull public static final Companion Companion = new Companion(null); private final int usersLimit; @NotNull private final Timestamp till; public TrialInfo(int usersLimit, @NotNull Timestamp till) { this.usersLimit = usersLimit;
/* 87 */         this.till = till; } @NotNull public final Timestamp getTill() { return this.till; }
/*    */ 
/*    */       
/*    */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/license/JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-license"})
/*    */       public static final class $serializer implements GeneratedSerializer<TrialInfo> {
/*    */         @NotNull
/*    */         public static final $serializer INSTANCE = new $serializer();
/*    */         
/*    */         @NotNull
/*    */         public KSerializer<?>[] typeParametersSerializers() {
/*    */           return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public SerialDescriptor getDescriptor() {
/*    */           return (SerialDescriptor)descriptor;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public KSerializer<?>[] childSerializers() {
/*    */           KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */           arrayOfKSerializer[0] = (KSerializer)IntSerializer.INSTANCE;
/*    */           arrayOfKSerializer[1] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*    */           return (KSerializer<?>[])arrayOfKSerializer;
/*    */         }
/*    */         
/*    */         @NotNull
/*    */         public JBALicense.AdditionalData.IDESAdditionalData.TrialInfo deserialize(@NotNull Decoder decoder) {
/*    */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           boolean bool = true;
/*    */           int i = 0, j = 0;
/*    */           Timestamp timestamp = null;
/*    */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */           if (compositeDecoder.decodeSequentially()) {
/*    */             j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
/*    */             i |= 0x1;
/*    */             timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */             i |= 0x2;
/*    */           } else {
/*    */             while (bool) {
/*    */               int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */               switch (k) {
/*    */                 case -1:
/*    */                   bool = false;
/*    */                   continue;
/*    */                 case 0:
/*    */                   j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
/*    */                   i |= 0x1;
/*    */                   continue;
/*    */                 case 1:
/*    */                   timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */                   i |= 0x2;
/*    */                   continue;
/*    */               } 
/*    */               throw new UnknownFieldException(k);
/*    */             } 
/*    */           } 
/*    */           compositeDecoder.endStructure(serialDescriptor);
/*    */           return new JBALicense.AdditionalData.IDESAdditionalData.TrialInfo(i, j, timestamp, null);
/*    */         }
/*    */         
/*    */         public void serialize(@NotNull Encoder encoder, @NotNull JBALicense.AdditionalData.IDESAdditionalData.TrialInfo value) {
/*    */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */           Intrinsics.checkNotNullParameter(value, "value");
/*    */           SerialDescriptor serialDescriptor = getDescriptor();
/*    */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */           JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.write$Self$model_license(value, compositeEncoder, serialDescriptor);
/*    */           compositeEncoder.endStructure(serialDescriptor);
/*    */         }
/*    */         
/*    */         static {
/*    */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.license.JBALicense.AdditionalData.IDESAdditionalData.TrialInfo", INSTANCE, 2);
/*    */           pluginGeneratedSerialDescriptor.addElement("usersLimit", false);
/*    */           pluginGeneratedSerialDescriptor.addElement("till", false);
/*    */           descriptor = pluginGeneratedSerialDescriptor;
/*    */         }
/*    */       }
/*    */       
/*    */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "model-license"})
/*    */       public static final class Companion {
/*    */         private Companion() {}
/*    */         
/*    */         @NotNull
/*    */         public final KSerializer<JBALicense.AdditionalData.IDESAdditionalData.TrialInfo> serializer() {
/*    */           return (KSerializer<JBALicense.AdditionalData.IDESAdditionalData.TrialInfo>)JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.$serializer.INSTANCE;
/*    */         }
/*    */       }
/*    */       
/*    */       public final int getUsersLimit() {
/*    */         return this.usersLimit;
/*    */       }
/*    */       
/*    */       public final int component1() {
/*    */         return this.usersLimit;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final Timestamp component2() {
/*    */         return this.till;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public final TrialInfo copy(int usersLimit, @NotNull Timestamp till) {
/*    */         Intrinsics.checkNotNullParameter(till, "till");
/*    */         return new TrialInfo(usersLimit, till);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public String toString() {
/*    */         return "TrialInfo(usersLimit=" + this.usersLimit + ", till=" + this.till + ")";
/*    */       }
/*    */       
/*    */       public int hashCode() {
/*    */         result = Integer.hashCode(this.usersLimit);
/*    */         return result * 31 + this.till.hashCode();
/*    */       }
/*    */       
/*    */       public boolean equals(@Nullable Object other) {
/*    */         if (this == other)
/*    */           return true; 
/*    */         if (!(other instanceof TrialInfo))
/*    */           return false; 
/*    */         TrialInfo trialInfo = (TrialInfo)other;
/*    */         return (this.usersLimit != trialInfo.usersLimit) ? false : (!!Intrinsics.areEqual(this.till, trialInfo.till));
/*    */       }
/*    */     }
/*    */     
/*    */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*    */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/license/JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/license/JBALicense$AdditionalData$IDESAdditionalData$TrialInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-license"})
/*    */     public static final class $serializer implements GeneratedSerializer<TrialInfo> {
/*    */       @NotNull
/*    */       public static final $serializer INSTANCE = new $serializer();
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] typeParametersSerializers() {
/*    */         return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public SerialDescriptor getDescriptor() {
/*    */         return (SerialDescriptor)descriptor;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public KSerializer<?>[] childSerializers() {
/*    */         KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*    */         arrayOfKSerializer[0] = (KSerializer)IntSerializer.INSTANCE;
/*    */         arrayOfKSerializer[1] = (KSerializer)Timestamp.Serializer.INSTANCE;
/*    */         return (KSerializer<?>[])arrayOfKSerializer;
/*    */       }
/*    */       
/*    */       @NotNull
/*    */       public JBALicense.AdditionalData.IDESAdditionalData.TrialInfo deserialize(@NotNull Decoder decoder) {
/*    */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         boolean bool = true;
/*    */         int i = 0, j = 0;
/*    */         Timestamp timestamp = null;
/*    */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*    */         if (compositeDecoder.decodeSequentially()) {
/*    */           j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
/*    */           i |= 0x1;
/*    */           timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */           i |= 0x2;
/*    */         } else {
/*    */           while (bool) {
/*    */             int k = compositeDecoder.decodeElementIndex(serialDescriptor);
/*    */             switch (k) {
/*    */               case -1:
/*    */                 bool = false;
/*    */                 continue;
/*    */               case 0:
/*    */                 j = compositeDecoder.decodeIntElement(serialDescriptor, 0);
/*    */                 i |= 0x1;
/*    */                 continue;
/*    */               case 1:
/*    */                 timestamp = (Timestamp)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Timestamp.Serializer.INSTANCE, timestamp);
/*    */                 i |= 0x2;
/*    */                 continue;
/*    */             } 
/*    */             throw new UnknownFieldException(k);
/*    */           } 
/*    */         } 
/*    */         compositeDecoder.endStructure(serialDescriptor);
/*    */         return new JBALicense.AdditionalData.IDESAdditionalData.TrialInfo(i, j, timestamp, null);
/*    */       }
/*    */       
/*    */       public void serialize(@NotNull Encoder encoder, @NotNull JBALicense.AdditionalData.IDESAdditionalData.TrialInfo value) {
/*    */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*    */         Intrinsics.checkNotNullParameter(value, "value");
/*    */         SerialDescriptor serialDescriptor = getDescriptor();
/*    */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*    */         JBALicense.AdditionalData.IDESAdditionalData.TrialInfo.write$Self$model_license(value, compositeEncoder, serialDescriptor);
/*    */         compositeEncoder.endStructure(serialDescriptor);
/*    */       }
/*    */       
/*    */       static {
/*    */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.license.JBALicense.AdditionalData.IDESAdditionalData.TrialInfo", INSTANCE, 2);
/*    */         pluginGeneratedSerialDescriptor.addElement("usersLimit", false);
/*    */         pluginGeneratedSerialDescriptor.addElement("till", false);
/*    */         descriptor = pluginGeneratedSerialDescriptor;
/*    */       }
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-license-jvm-0.4.32.jar!\ai\grazie\license\JBALicense$AdditionalData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */