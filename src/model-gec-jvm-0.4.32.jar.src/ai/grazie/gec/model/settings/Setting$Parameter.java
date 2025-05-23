/*     */ package ai.grazie.gec.model.settings;
/*     */ 
/*     */ import java.util.Arrays;
/*     */ import kotlin.Deprecated;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ReplaceWith;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.JvmStatic;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.Reflection;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerialName;
/*     */ import kotlinx.serialization.Serializable;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.UnknownFieldException;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.ReferenceArraySerializer;
/*     */ import kotlinx.serialization.internal.SerializationConstructorMarker;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Serializable
/*     */ @SerialName("Parameter")
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\020\021\n\000\n\002\030\002\n\002\b\021\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 ,2\0020\001:\002+,BG\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\005\022\b\020\007\032\004\030\0010\b\022\016\020\t\032\n\022\004\022\0020\b\030\0010\n\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB+\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005\022\006\020\007\032\0020\b\022\f\020\t\032\b\022\004\022\0020\b0\n¢\006\002\020\016J\t\020\027\032\0020\005HÆ\003J\t\020\030\032\0020\005HÆ\003J\t\020\031\032\0020\bHÆ\003J\024\020\032\032\b\022\004\022\0020\b0\nHÆ\003¢\006\002\020\025J<\020\033\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0052\b\b\002\020\007\032\0020\b2\016\b\002\020\t\032\b\022\004\022\0020\b0\nHÆ\001¢\006\002\020\034J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010 H\002J\b\020!\032\0020\003H\026J\b\020\"\032\0020\005H\026J&\020#\032\0020$2\006\020%\032\0020\0002\006\020&\032\0020'2\006\020(\032\0020)HÁ\001¢\006\002\b*R\024\020\007\032\0020\bX\004¢\006\b\n\000\032\004\b\017\020\020R\024\020\006\032\0020\005X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\023\020\022R\031\020\t\032\b\022\004\022\0020\b0\n¢\006\n\n\002\020\026\032\004\b\024\020\025¨\006-"}, d2 = {"Lai/grazie/gec/model/settings/Setting$Parameter;", "Lai/grazie/gec/model/settings/Setting;", "seen1", "", "id", "", "displayName", "defaultValue", "Lai/grazie/gec/model/settings/Setting$Value;", "possibleValues", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lai/grazie/gec/model/settings/Setting$Value;[Lai/grazie/gec/model/settings/Setting$Value;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/gec/model/settings/Setting$Value;[Lai/grazie/gec/model/settings/Setting$Value;)V", "getDefaultValue", "()Lai/grazie/gec/model/settings/Setting$Value;", "getDisplayName", "()Ljava/lang/String;", "getId", "getPossibleValues", "()[Lai/grazie/gec/model/settings/Setting$Value;", "[Lai/grazie/gec/model/settings/Setting$Value;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lai/grazie/gec/model/settings/Setting$Value;[Lai/grazie/gec/model/settings/Setting$Value;)Lai/grazie/gec/model/settings/Setting$Parameter;", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "model-gec"})
/*     */ public final class Parameter
/*     */   extends Setting
/*     */ {
/*     */   @NotNull
/*  91 */   public static final Companion Companion = new Companion(null); @NotNull private final String id; @NotNull private final String displayName; @NotNull private final Setting.Value defaultValue; @NotNull private final Setting.Value[] possibleValues; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[4]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Setting.Value.class), (KSerializer)Setting.Value.$serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/settings/Setting.Parameter.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/settings/Setting$Parameter;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<Parameter> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])Setting.Parameter.$childSerializers, arrayOfKSerializer2 = new KSerializer[4]; arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)Setting.Value.$serializer.INSTANCE; arrayOfKSerializer2[3] = arrayOfKSerializer1[3]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public Setting.Parameter deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str1 = null, str2 = null; Setting.Value value = null, arrayOfValue[] = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])Setting.Parameter.$childSerializers; if (compositeDecoder.decodeSequentially()) { str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; value = (Setting.Value)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Setting.Value.$serializer.INSTANCE, value); i |= 0x4; arrayOfValue = (Setting.Value[])compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], arrayOfValue); i |= 0x8; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: str2 = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: value = (Setting.Value)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)Setting.Value.$serializer.INSTANCE, value); i |= 0x4; continue;case 3: arrayOfValue = (Setting.Value[])compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], arrayOfValue); i |= 0x8; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Setting.Parameter(i, str1, str2, value, arrayOfValue, null); } public void serialize(@NotNull Encoder encoder, @NotNull Setting.Parameter value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Setting.Parameter.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Parameter", INSTANCE, 4); pluginGeneratedSerialDescriptor.addElement("id", false); pluginGeneratedSerialDescriptor.addElement("displayName", false); pluginGeneratedSerialDescriptor.addElement("defaultValue", false); pluginGeneratedSerialDescriptor.addElement("possibleValues", false); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/settings/Setting$Parameter$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/settings/Setting$Parameter;", "model-gec"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Setting.Parameter> serializer() { return (KSerializer<Setting.Parameter>)Setting.Parameter.$serializer.INSTANCE; }
/*     */      }
/*     */   @NotNull
/*  94 */   public String getId() { return this.id; } @NotNull
/*  95 */   public String getDisplayName() { return this.displayName; } @NotNull
/*  96 */   public Setting.Value getDefaultValue() { return this.defaultValue; } @NotNull
/*  97 */   public final Setting.Value[] getPossibleValues() { return this.possibleValues; }
/*  98 */   public Parameter(@NotNull String id, @NotNull String displayName, @NotNull Setting.Value defaultValue, @NotNull Setting.Value[] possibleValues) { super(null); this.id = id; this.displayName = displayName;
/*     */     this.defaultValue = defaultValue;
/* 100 */     this.possibleValues = possibleValues; } public boolean equals(@Nullable Object other) { if (this == other) return true; 
/* 101 */     if (!(other instanceof Parameter)) return false;
/*     */     
/* 103 */     if (!Intrinsics.areEqual(getId(), ((Parameter)other).getId())) return false; 
/* 104 */     if (!Intrinsics.areEqual(getDisplayName(), ((Parameter)other).getDisplayName())) return false; 
/* 105 */     if (!Intrinsics.areEqual(getDefaultValue(), ((Parameter)other).getDefaultValue())) return false; 
/* 106 */     return Arrays.equals((Object[])this.possibleValues, (Object[])((Parameter)other).possibleValues); }
/*     */ 
/*     */   
/*     */   public int hashCode() {
/* 110 */     int result = getId().hashCode();
/* 111 */     result = 31 * result + getDisplayName().hashCode();
/* 112 */     result = 31 * result + getDefaultValue().hashCode();
/* 113 */     result = 31 * result + Arrays.hashCode((Object[])this.possibleValues);
/* 114 */     return result;
/*     */   }
/*     */   @NotNull public final String component1() { return this.id; }
/*     */   @NotNull public final String component2() { return this.displayName; } @NotNull public final Setting.Value component3() { return this.defaultValue; } @NotNull
/* 118 */   public String toString() { return "Parameter(id=" + getId() + ", defaultValue=" + getDefaultValue().getId() + ", possibleValues=[" + ArraysKt.joinToString$default((Object[])this.possibleValues, null, null, null, 0, null, Setting$Parameter$toString$1.INSTANCE, 31, null) + "])"; } @NotNull public final Setting.Value[] component4() { return this.possibleValues; } @NotNull public final Parameter copy(@NotNull String id, @NotNull String displayName, @NotNull Setting.Value defaultValue, @NotNull Setting.Value[] possibleValues) { Intrinsics.checkNotNullParameter(id, "id"); Intrinsics.checkNotNullParameter(displayName, "displayName"); Intrinsics.checkNotNullParameter(defaultValue, "defaultValue"); Intrinsics.checkNotNullParameter(possibleValues, "possibleValues"); return new Parameter(id, displayName, defaultValue, possibleValues); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/gec/model/settings/Setting$Value;", "invoke"}) static final class Setting$Parameter$toString$1 extends Lambda implements Function1<Setting.Value, CharSequence> { public final CharSequence invoke(Setting.Value it) { Intrinsics.checkNotNullParameter(it, "it"); return it.getId(); }
/*     */ 
/*     */     
/*     */     public static final Setting$Parameter$toString$1 INSTANCE = new Setting$Parameter$toString$1();
/*     */     
/*     */     Setting$Parameter$toString$1() {
/*     */       super(1);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\settings\Setting$Parameter.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */