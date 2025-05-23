/*     */ package ai.grazie.gec.model.problem;
/*     */ 
/*     */ import ai.grazie.gec.model.CorrectionServiceType;
/*     */ import ai.grazie.gec.model.SentenceWithCorrections;
/*     */ import ai.grazie.text.TextRange;
/*     */ import ai.grazie.utils.attributes.StringProperties;
/*     */ import java.util.Arrays;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.DeprecationLevel;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.SerializationStrategy;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.GeneratedSerializer;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import kotlinx.serialization.internal.StringSerializer;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000h\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\017\n\002\030\002\n\002\b\020\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\006\b\b\030\000 C2\0020\001:\004BCDEBk\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\016\020\n\032\n\022\004\022\0020\f\030\0010\013\022\b\020\r\032\004\030\0010\016\022\b\020\017\032\004\030\0010\016\022\016\020\020\032\n\022\004\022\0020\021\030\0010\013\022\b\020\022\032\004\030\0010\023¢\006\002\020\024BU\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\f\020\n\032\b\022\004\022\0020\f0\013\022\n\b\002\020\r\032\004\030\0010\016\022\n\b\002\020\017\032\004\030\0010\016\022\020\b\002\020\020\032\n\022\004\022\0020\021\030\0010\013¢\006\002\020\025J\006\020)\032\0020*J\t\020+\032\0020\005HÆ\003J\t\020,\032\0020\007HÆ\003J\t\020-\032\0020\tHÆ\003J\024\020.\032\b\022\004\022\0020\f0\013HÆ\003¢\006\002\020!J\013\020/\032\004\030\0010\016HÆ\003J\013\0200\032\004\030\0010\016HÆ\003J\026\0201\032\n\022\004\022\0020\021\030\0010\013HÆ\003¢\006\002\020\027Jf\0202\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\016\b\002\020\n\032\b\022\004\022\0020\f0\0132\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0162\020\b\002\020\020\032\n\022\004\022\0020\021\030\0010\013HÆ\001¢\006\002\0203J\023\0204\032\0020\0322\b\0205\032\004\030\0010\001H\002J\b\0206\032\0020\003H\026J\t\0207\032\0020\007HÖ\001J\016\0208\032\0020\0002\006\0209\032\0020\003J&\020:\032\0020;2\006\020<\032\0020\0002\006\020=\032\0020>2\006\020?\032\0020@HÁ\001¢\006\002\bAR\033\020\020\032\n\022\004\022\0020\021\030\0010\013¢\006\n\n\002\020\030\032\004\b\026\020\027R\021\020\031\032\0020\0328F¢\006\006\032\004\b\033\020\034R\023\020\017\032\004\030\0010\016¢\006\b\n\000\032\004\b\035\020\036R\023\020\r\032\004\030\0010\016¢\006\b\n\000\032\004\b\037\020\036R\031\020\n\032\b\022\004\022\0020\f0\013¢\006\n\n\002\020\"\032\004\b \020!R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b#\020$R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b%\020&R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b'\020(¨\006F"}, d2 = {"Lai/grazie/gec/model/problem/Problem;", "", "seen1", "", "info", "Lai/grazie/gec/model/problem/Problem$KindInfo;", "message", "", "highlighting", "Lai/grazie/gec/model/problem/ProblemHighlighting;", "fixes", "", "Lai/grazie/gec/model/problem/ProblemFix;", "experimental", "Lai/grazie/utils/attributes/StringProperties;", "condition", "actionSuggestions", "Lai/grazie/gec/model/problem/ActionSuggestion;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gec/model/problem/Problem$KindInfo;Ljava/lang/String;Lai/grazie/gec/model/problem/ProblemHighlighting;[Lai/grazie/gec/model/problem/ProblemFix;Lai/grazie/utils/attributes/StringProperties;Lai/grazie/utils/attributes/StringProperties;[Lai/grazie/gec/model/problem/ActionSuggestion;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/gec/model/problem/Problem$KindInfo;Ljava/lang/String;Lai/grazie/gec/model/problem/ProblemHighlighting;[Lai/grazie/gec/model/problem/ProblemFix;Lai/grazie/utils/attributes/StringProperties;Lai/grazie/utils/attributes/StringProperties;[Lai/grazie/gec/model/problem/ActionSuggestion;)V", "getActionSuggestions", "()[Lai/grazie/gec/model/problem/ActionSuggestion;", "[Lai/grazie/gec/model/problem/ActionSuggestion;", "autoFixCapable", "", "getAutoFixCapable", "()Z", "getCondition", "()Lai/grazie/utils/attributes/StringProperties;", "getExperimental", "getFixes", "()[Lai/grazie/gec/model/problem/ProblemFix;", "[Lai/grazie/gec/model/problem/ProblemFix;", "getHighlighting", "()Lai/grazie/gec/model/problem/ProblemHighlighting;", "getInfo", "()Lai/grazie/gec/model/problem/Problem$KindInfo;", "getMessage", "()Ljava/lang/String;", "analyzeCondition", "Lai/grazie/gec/model/problem/ProblemConditionAnalyzer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lai/grazie/gec/model/problem/Problem$KindInfo;Ljava/lang/String;Lai/grazie/gec/model/problem/ProblemHighlighting;[Lai/grazie/gec/model/problem/ProblemFix;Lai/grazie/utils/attributes/StringProperties;Lai/grazie/utils/attributes/StringProperties;[Lai/grazie/gec/model/problem/ActionSuggestion;)Lai/grazie/gec/model/problem/Problem;", "equals", "other", "hashCode", "toString", "withOffset", "offset", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "Confidence", "KindInfo", "model-gec"})
/*     */ @SourceDebugExtension({"SMAP\nProblem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Problem.kt\nai/grazie/gec/model/problem/Problem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,163:1\n11158#2:164\n11493#2,3:165\n11158#2:172\n11493#2,3:173\n11158#2:180\n11493#2,2:181\n11158#2:183\n11493#2,3:184\n11495#2:191\n37#3:168\n36#3,3:169\n37#3:176\n36#3,3:177\n37#3:187\n36#3,3:188\n37#3:192\n36#3,3:193\n*S KotlinDebug\n*F\n+ 1 Problem.kt\nai/grazie/gec/model/problem/Problem\n*L\n91#1:164\n91#1:165,3\n92#1:172\n92#1:173,3\n94#1:180\n94#1:181,2\n95#1:183\n95#1:184,3\n94#1:191\n91#1:168\n91#1:169,3\n92#1:176\n92#1:177,3\n101#1:187\n101#1:188,3\n102#1:192\n102#1:193,3\n*E\n"})
/*     */ public final class Problem {
/*  32 */   public Problem(@NotNull KindInfo info, @NotNull String message, @NotNull ProblemHighlighting highlighting, @NotNull ProblemFix[] fixes, @Nullable StringProperties experimental, @Nullable StringProperties condition, @Nullable ActionSuggestion[] actionSuggestions) { this.info = info;
/*  33 */     this.message = message;
/*  34 */     this.highlighting = highlighting;
/*  35 */     this.fixes = fixes;
/*  36 */     this.experimental = experimental;
/*  37 */     this.condition = condition;
/*  38 */     this.actionSuggestions = actionSuggestions; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/Problem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/Problem;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<Problem> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])Problem.$childSerializers, arrayOfKSerializer2 = new KSerializer[7]; arrayOfKSerializer2[0] = (KSerializer)Problem.KindInfo.$serializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[2] = (KSerializer)ProblemHighlighting.$serializer.INSTANCE; arrayOfKSerializer2[3] = arrayOfKSerializer1[3]; arrayOfKSerializer2[4] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[4]); arrayOfKSerializer2[5] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[5]); arrayOfKSerializer2[6] = BuiltinSerializersKt.getNullable(arrayOfKSerializer1[6]); return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public Problem deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; Problem.KindInfo kindInfo = null; String str = null; ProblemHighlighting problemHighlighting = null; ProblemFix[] arrayOfProblemFix = null; StringProperties stringProperties1 = null, stringProperties2 = null; ActionSuggestion[] arrayOfActionSuggestion = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])Problem.$childSerializers; if (compositeDecoder.decodeSequentially()) { kindInfo = (Problem.KindInfo)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Problem.KindInfo.$serializer.INSTANCE, kindInfo); i |= 0x1; str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; problemHighlighting = (ProblemHighlighting)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)ProblemHighlighting.$serializer.INSTANCE, problemHighlighting); i |= 0x4; arrayOfProblemFix = (ProblemFix[])compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], arrayOfProblemFix); i |= 0x8; stringProperties1 = (StringProperties)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], stringProperties1); i |= 0x10; stringProperties2 = (StringProperties)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)arrayOfKSerializer[5], stringProperties2); i |= 0x20; arrayOfActionSuggestion = (ActionSuggestion[])compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy)arrayOfKSerializer[6], arrayOfActionSuggestion); i |= 0x40; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: kindInfo = (Problem.KindInfo)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)Problem.KindInfo.$serializer.INSTANCE, kindInfo); i |= 0x1; continue;case 1: str = compositeDecoder.decodeStringElement(serialDescriptor, 1); i |= 0x2; continue;case 2: problemHighlighting = (ProblemHighlighting)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)ProblemHighlighting.$serializer.INSTANCE, problemHighlighting); i |= 0x4; continue;case 3: arrayOfProblemFix = (ProblemFix[])compositeDecoder.decodeSerializableElement(serialDescriptor, 3, (DeserializationStrategy)arrayOfKSerializer[3], arrayOfProblemFix); i |= 0x8; continue;case 4: stringProperties1 = (StringProperties)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)arrayOfKSerializer[4], stringProperties1); i |= 0x10; continue;case 5: stringProperties2 = (StringProperties)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 5, (DeserializationStrategy)arrayOfKSerializer[5], stringProperties2); i |= 0x20; continue;case 6: arrayOfActionSuggestion = (ActionSuggestion[])compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 6, (DeserializationStrategy)arrayOfKSerializer[6], arrayOfActionSuggestion); i |= 0x40; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Problem(i, kindInfo, str, problemHighlighting, arrayOfProblemFix, stringProperties1, stringProperties2, arrayOfActionSuggestion, null); } public void serialize(@NotNull Encoder encoder, @NotNull Problem value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Problem.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.problem.Problem", INSTANCE, 7); pluginGeneratedSerialDescriptor.addElement("info", false); pluginGeneratedSerialDescriptor.addElement("message", false); pluginGeneratedSerialDescriptor.addElement("highlighting", false); pluginGeneratedSerialDescriptor.addElement("fixes", false); pluginGeneratedSerialDescriptor.addElement("experimental", true); pluginGeneratedSerialDescriptor.addElement("condition", true); pluginGeneratedSerialDescriptor.addElement("actionSuggestions", true); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final KindInfo getInfo() { return this.info; } @NotNull public final String getMessage() { return this.message; } @NotNull public final ProblemHighlighting getHighlighting() { return this.highlighting; } @NotNull public final ProblemFix[] getFixes() { return this.fixes; } @Nullable public final StringProperties getExperimental() { return this.experimental; } @Nullable public final StringProperties getCondition() { return this.condition; } @Nullable public final ActionSuggestion[] getActionSuggestions() { return this.actionSuggestions; }
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000V\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\027\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 52\0020\001:\00245BW\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\013\022\b\020\f\032\004\030\0010\013\022\n\b\001\020\r\032\004\030\0010\016\022\b\020\017\032\004\030\0010\020¢\006\002\020\021B;\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\006\020\b\032\0020\t\022\006\020\n\032\0020\013\022\n\b\002\020\f\032\004\030\0010\013\022\b\b\002\020\r\032\0020\016¢\006\002\020\022J\t\020 \032\0020\005HÆ\003J\t\020!\032\0020\007HÆ\003J\t\020\"\032\0020\tHÆ\003J\t\020#\032\0020\013HÆ\003J\013\020$\032\004\030\0010\013HÆ\003J\t\020%\032\0020\016HÆ\003JG\020&\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\b\b\002\020\b\032\0020\t2\b\b\002\020\n\032\0020\0132\n\b\002\020\f\032\004\030\0010\0132\b\b\002\020\r\032\0020\016HÆ\001J\023\020'\032\0020(2\b\020)\032\004\030\0010\001HÖ\003J\t\020*\032\0020\003HÖ\001J\t\020+\032\0020\013HÖ\001J&\020,\032\0020-2\006\020.\032\0020\0002\006\020/\032\002002\006\0201\032\00202HÁ\001¢\006\002\b3R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\023\020\024R\034\020\r\032\0020\0168\006X\004¢\006\016\n\000\022\004\b\025\020\026\032\004\b\027\020\030R\021\020\n\032\0020\013¢\006\b\n\000\032\004\b\031\020\032R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\033\020\034R\023\020\f\032\004\030\0010\013¢\006\b\n\000\032\004\b\035\020\032R\021\020\b\032\0020\t¢\006\b\n\000\032\004\b\036\020\037¨\0066"}, d2 = {"Lai/grazie/gec/model/problem/Problem$KindInfo;", "", "seen1", "", "id", "Lai/grazie/gec/model/problem/ProblemKindID;", "category", "Lai/grazie/gec/model/problem/Category;", "service", "Lai/grazie/gec/model/CorrectionServiceType;", "displayName", "", "ruleSettingsId", "confidence", "Lai/grazie/gec/model/problem/Problem$Confidence;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gec/model/problem/ProblemKindID;Lai/grazie/gec/model/problem/Category;Lai/grazie/gec/model/CorrectionServiceType;Ljava/lang/String;Ljava/lang/String;Lai/grazie/gec/model/problem/Problem$Confidence;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/gec/model/problem/ProblemKindID;Lai/grazie/gec/model/problem/Category;Lai/grazie/gec/model/CorrectionServiceType;Ljava/lang/String;Ljava/lang/String;Lai/grazie/gec/model/problem/Problem$Confidence;)V", "getCategory", "()Lai/grazie/gec/model/problem/Category;", "getConfidence$annotations", "()V", "getConfidence", "()Lai/grazie/gec/model/problem/Problem$Confidence;", "getDisplayName", "()Ljava/lang/String;", "getId", "()Lai/grazie/gec/model/problem/ProblemKindID;", "getRuleSettingsId", "getService", "()Lai/grazie/gec/model/CorrectionServiceType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "model-gec"})
/*     */   public static final class KindInfo { @NotNull
/*     */     public static final Companion Companion = new Companion(null); @NotNull
/*     */     private final ProblemKindID id; @NotNull
/*     */     private final Category category; @NotNull
/*     */     private final CorrectionServiceType service; @NotNull
/*     */     private final String displayName;
/*     */     @Nullable
/*     */     private final String ruleSettingsId;
/*     */     @NotNull
/*     */     private final Problem.Confidence confidence;
/*     */     
/*  53 */     public KindInfo(@NotNull ProblemKindID id, @NotNull Category category, @NotNull CorrectionServiceType service, @NotNull String displayName, @Nullable String ruleSettingsId, @NotNull Problem.Confidence confidence) { this.id = id;
/*  54 */       this.category = category;
/*  55 */       this.service = service;
/*  56 */       this.displayName = displayName;
/*  57 */       this.ruleSettingsId = ruleSettingsId;
/*     */       
/*  59 */       this.confidence = confidence; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/Problem.KindInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/Problem$KindInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<KindInfo> {
/*  60 */       @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)ProblemKindID.Serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)Category.Serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)CorrectionServiceType.Serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[5] = (KSerializer)Problem.Confidence.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Problem.KindInfo deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ProblemKindID problemKindID = null; Category category = null; CorrectionServiceType correctionServiceType = null; String str1 = null, str2 = null; Problem.Confidence confidence = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { problemKindID = (ProblemKindID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemKindID.Serializer.INSTANCE, problemKindID); i |= 0x1; category = (Category)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Category.Serializer.INSTANCE, category); i |= 0x2; correctionServiceType = (CorrectionServiceType)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)CorrectionServiceType.Serializer.INSTANCE, correctionServiceType); i |= 0x4; str1 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x10; confidence = (Problem.Confidence)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)Problem.Confidence.Serializer.INSTANCE, confidence); i |= 0x20; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: problemKindID = (ProblemKindID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemKindID.Serializer.INSTANCE, problemKindID); i |= 0x1; continue;case 1: category = (Category)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Category.Serializer.INSTANCE, category); i |= 0x2; continue;case 2: correctionServiceType = (CorrectionServiceType)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)CorrectionServiceType.Serializer.INSTANCE, correctionServiceType); i |= 0x4; continue;case 3: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue;case 4: str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x10; continue;case 5: confidence = (Problem.Confidence)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)Problem.Confidence.Serializer.INSTANCE, confidence); i |= 0x20; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Problem.KindInfo(i, problemKindID, category, correctionServiceType, str1, str2, confidence, null); } public void serialize(@NotNull Encoder encoder, @NotNull Problem.KindInfo value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Problem.KindInfo.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.problem.Problem.KindInfo", INSTANCE, 6); pluginGeneratedSerialDescriptor.addElement("id", false); pluginGeneratedSerialDescriptor.addElement("category", false); pluginGeneratedSerialDescriptor.addElement("service", false); pluginGeneratedSerialDescriptor.addElement("displayName", false); pluginGeneratedSerialDescriptor.addElement("ruleSettingsId", true); pluginGeneratedSerialDescriptor.addElement("confidence", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/Problem$KindInfo$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/Problem$KindInfo;", "model-gec"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Problem.KindInfo> serializer() { return (KSerializer<Problem.KindInfo>)Problem.KindInfo.$serializer.INSTANCE; } } @NotNull public final ProblemKindID getId() { return this.id; } @NotNull public final Category getCategory() { return this.category; } @NotNull public final CorrectionServiceType getService() { return this.service; } @NotNull public final String getDisplayName() { return this.displayName; } @Nullable public final String getRuleSettingsId() { return this.ruleSettingsId; } @NotNull public final Problem.Confidence getConfidence() { return this.confidence; }
/*     */     @NotNull public final ProblemKindID component1() { return this.id; }
/*     */     @NotNull public final Category component2() { return this.category; } @NotNull public final CorrectionServiceType component3() { return this.service; } @NotNull public final String component4() { return this.displayName; } @Nullable public final String component5() { return this.ruleSettingsId; } @NotNull public final Problem.Confidence component6() { return this.confidence; } @NotNull public final KindInfo copy(@NotNull ProblemKindID id, @NotNull Category category, @NotNull CorrectionServiceType service, @NotNull String displayName, @Nullable String ruleSettingsId, @NotNull Problem.Confidence confidence) { Intrinsics.checkNotNullParameter(id, "id"); Intrinsics.checkNotNullParameter(category, "category"); Intrinsics.checkNotNullParameter(service, "service"); Intrinsics.checkNotNullParameter(displayName, "displayName"); Intrinsics.checkNotNullParameter(confidence, "confidence"); return new KindInfo(id, category, service, displayName, ruleSettingsId, confidence); } @NotNull public String toString() { return "KindInfo(id=" + this.id + ", category=" + this.category + ", service=" + this.service + ", displayName=" + this.displayName + ", ruleSettingsId=" + this.ruleSettingsId + ", confidence=" + this.confidence + ")"; } public int hashCode() { result = this.id.hashCode(); result = result * 31 + this.category.hashCode(); result = result * 31 + this.service.hashCode(); result = result * 31 + this.displayName.hashCode(); result = result * 31 + ((this.ruleSettingsId == null) ? 0 : this.ruleSettingsId.hashCode()); return result * 31 + this.confidence.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof KindInfo)) return false;  KindInfo kindInfo = (KindInfo)other; return !Intrinsics.areEqual(this.id, kindInfo.id) ? false : ((this.category != kindInfo.category) ? false : ((this.service != kindInfo.service) ? false : (!Intrinsics.areEqual(this.displayName, kindInfo.displayName) ? false : (!Intrinsics.areEqual(this.ruleSettingsId, kindInfo.ruleSettingsId) ? false : (!(this.confidence != kindInfo.confidence)))))); } }
/*  63 */    @NotNull public static final Companion Companion = new Companion(null); @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/Problem.KindInfo.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/Problem$KindInfo;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<KindInfo> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer = new KSerializer[6]; arrayOfKSerializer[0] = (KSerializer)ProblemKindID.Serializer.INSTANCE; arrayOfKSerializer[1] = (KSerializer)Category.Serializer.INSTANCE; arrayOfKSerializer[2] = (KSerializer)CorrectionServiceType.Serializer.INSTANCE; arrayOfKSerializer[3] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer[4] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer[5] = (KSerializer)Problem.Confidence.Serializer.INSTANCE; return (KSerializer<?>[])arrayOfKSerializer; } @NotNull public Problem.KindInfo deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ProblemKindID problemKindID = null; Category category = null; CorrectionServiceType correctionServiceType = null; String str1 = null, str2 = null; Problem.Confidence confidence = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); if (compositeDecoder.decodeSequentially()) { problemKindID = (ProblemKindID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemKindID.Serializer.INSTANCE, problemKindID); i |= 0x1; category = (Category)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Category.Serializer.INSTANCE, category); i |= 0x2; correctionServiceType = (CorrectionServiceType)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)CorrectionServiceType.Serializer.INSTANCE, correctionServiceType); i |= 0x4; str1 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x10; confidence = (Problem.Confidence)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)Problem.Confidence.Serializer.INSTANCE, confidence); i |= 0x20; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: problemKindID = (ProblemKindID)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)ProblemKindID.Serializer.INSTANCE, problemKindID); i |= 0x1; continue;case 1: category = (Category)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Category.Serializer.INSTANCE, category); i |= 0x2; continue;case 2: correctionServiceType = (CorrectionServiceType)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)CorrectionServiceType.Serializer.INSTANCE, correctionServiceType); i |= 0x4; continue;case 3: str1 = compositeDecoder.decodeStringElement(serialDescriptor, 3); i |= 0x8; continue;case 4: str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 4, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x10; continue;case 5: confidence = (Problem.Confidence)compositeDecoder.decodeSerializableElement(serialDescriptor, 5, (DeserializationStrategy)Problem.Confidence.Serializer.INSTANCE, confidence); i |= 0x20; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new Problem.KindInfo(i, problemKindID, category, correctionServiceType, str1, str2, confidence, null); } public void serialize(@NotNull Encoder encoder, @NotNull Problem.KindInfo value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); Problem.KindInfo.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.problem.Problem.KindInfo", INSTANCE, 6); pluginGeneratedSerialDescriptor.addElement("id", false); pluginGeneratedSerialDescriptor.addElement("category", false); pluginGeneratedSerialDescriptor.addElement("service", false); pluginGeneratedSerialDescriptor.addElement("displayName", false); pluginGeneratedSerialDescriptor.addElement("ruleSettingsId", true); pluginGeneratedSerialDescriptor.addElement("confidence", true); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull private final KindInfo info; @NotNull private final String message; @NotNull private final ProblemHighlighting highlighting; @NotNull private final ProblemFix[] fixes; @Nullable private final StringProperties experimental; @Nullable private final StringProperties condition; @Nullable private final ActionSuggestion[] actionSuggestions; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[7]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; arrayOfKSerializer[3] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(ProblemFix.class), (KSerializer)ProblemFix.$serializer.INSTANCE); arrayOfKSerializer[4] = StringProperties.Companion.serializer(); arrayOfKSerializer[5] = StringProperties.Companion.serializer(); arrayOfKSerializer[6] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(ActionSuggestion.class), ActionSuggestion.Companion.serializer()); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/gec/model/problem/Problem$Companion;", "", "()V", "of", "Lai/grazie/gec/model/problem/Problem;", "correction", "Lai/grazie/gec/model/SentenceWithCorrections$Correction;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"}) @SourceDebugExtension({"SMAP\nProblem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Problem.kt\nai/grazie/gec/model/problem/Problem$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,163:1\n11158#2:164\n11493#2,3:165\n37#3:168\n36#3,3:169\n*S KotlinDebug\n*F\n+ 1 Problem.kt\nai/grazie/gec/model/problem/Problem$Companion\n*L\n72#1:164\n72#1:165,3\n74#1:168\n74#1:169,3\n*E\n"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<Problem> serializer() { return (KSerializer<Problem>)Problem.$serializer.INSTANCE; }
/*     */     @NotNull
/*  65 */     public final Problem of(@NotNull SentenceWithCorrections.Correction correction) { Intrinsics.checkNotNullParameter(correction, "correction");
/*     */ 
/*     */ 
/*     */       
/*  69 */       TextRange[] arrayOfTextRange = new TextRange[1]; arrayOfTextRange[0] = correction.getUnderlineRange();
/*     */ 
/*     */       
/*  72 */       String[] arrayOfString1 = correction.getReplacements(); ProblemHighlighting problemHighlighting1 = new ProblemHighlighting(arrayOfTextRange, new TextRange[0]); String str1 = correction.getMessage(); Problem.KindInfo kindInfo1 = new Problem.KindInfo(ProblemKindID.Companion.getLegacy(), Category.OTHER, correction.getService(), "legacy", null, null, 48, null); int $i$f$map = 0;
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
/* 164 */       String[] arrayOfString2 = arrayOfString1; Collection<ProblemFix> destination$iv$iv = new ArrayList(arrayOfString1.length); int $i$f$mapTo = 0; byte b1; int i;
/* 165 */       for (b1 = 0, i = arrayOfString2.length; b1 < i; ) { Object item$iv$iv = arrayOfString2[b1];
/* 166 */         Object object1 = item$iv$iv; Collection<ProblemFix> collection = destination$iv$iv; int $i$a$-map-Problem$Companion$of$1 = 0; ProblemFix.Part[] arrayOfPart = new ProblemFix.Part[1]; arrayOfPart[0] = new ProblemFix.Part.Change(correction.getErrorRange(), (String)object1); collection.add(new ProblemFix(arrayOfPart, null, null, 6, null)); }
/* 167 */        List list2 = (List)destination$iv$iv, list1 = list2;
/*     */       int $i$f$toTypedArray = 0;
/* 169 */       Collection thisCollection$iv = list1; DefaultConstructorMarker defaultConstructorMarker = null; byte b2 = 64; ActionSuggestion[] arrayOfActionSuggestion = null;
/*     */       StringProperties stringProperties1 = null, stringProperties2 = null;
/* 171 */       ProblemFix[] arrayOfProblemFix = (ProblemFix[])thisCollection$iv.toArray((Object[])new ProblemFix[0]); ProblemHighlighting problemHighlighting2 = problemHighlighting1; String str2 = str1; Problem.KindInfo kindInfo2 = kindInfo1; return new Problem(kindInfo2, str2, problemHighlighting2, arrayOfProblemFix, stringProperties2, stringProperties1, arrayOfActionSuggestion, b2, defaultConstructorMarker); } } public final boolean getAutoFixCapable() { if (this.fixes.length == 1) { this.experimental.getMap(); if (Intrinsics.areEqual((this.experimental != null && this.experimental.getMap() != null) ? this.experimental.getMap().get("autoFixCapable") : null, "true")); }  return false; } @NotNull public final Problem withOffset(int offset) { TextRange[] arrayOfTextRange2 = this.highlighting.getAlways(); ProblemHighlighting problemHighlighting = this.highlighting; String str = null; KindInfo kindInfo = null; Problem problem = this; int m = 0; TextRange[] arrayOfTextRange4 = arrayOfTextRange2; Collection<TextRange> collection4 = new ArrayList(arrayOfTextRange2.length); int $i$f$mapTo = 0; byte b; int n; for (b = 0, n = arrayOfTextRange4.length; b < n; ) { Object item$iv$iv = arrayOfTextRange4[b]; Object object1 = item$iv$iv; Collection<TextRange> collection = collection4; int $i$a$-map-Problem$withOffset$1 = 0; collection.add(ExtensionsKt.withOffset((TextRange)object1, offset)); }  List list5 = (List)collection4, list3 = list5; int k = 0; Collection collection2 = list3; TextRange[] arrayOfTextRange1 = this.highlighting.getOnHover(), arrayOfTextRange5 = (TextRange[])collection2.toArray((Object[])new TextRange[0]); problemHighlighting = problemHighlighting; str = str; kindInfo = kindInfo; problem = problem; int j = 0;
/* 172 */     TextRange[] arrayOfTextRange3 = arrayOfTextRange1; Collection<TextRange> collection3 = new ArrayList(arrayOfTextRange1.length); $i$f$mapTo = 0;
/* 173 */     for (b = 0, n = arrayOfTextRange3.length; b < n; ) { Object item$iv$iv = arrayOfTextRange3[b];
/* 174 */       Object object1 = item$iv$iv; Collection<TextRange> collection = collection3; int $i$a$-map-Problem$withOffset$2 = 0; collection.add(ExtensionsKt.withOffset((TextRange)object1, offset)); }
/* 175 */      List list6 = (List)collection3, list2 = list6;
/*     */     int i = 0;
/* 177 */     Collection collection1 = list2;
/*     */     ProblemFix[] arrayOfProblemFix1 = this.fixes;
/* 179 */     problemHighlighting = problemHighlighting.copy(arrayOfTextRange5, (TextRange[])collection1.toArray((Object[])new TextRange[0])); str = str; kindInfo = kindInfo; problem = problem; int $i$f$map = 0;
/* 180 */     ProblemFix[] arrayOfProblemFix2 = arrayOfProblemFix1; Collection destination$iv$iv = new ArrayList(arrayOfProblemFix1.length); $i$f$mapTo = 0;
/* 181 */     for (b = 0, n = arrayOfProblemFix2.length; b < n; ) { Object item$iv$iv = arrayOfProblemFix2[b];
/* 182 */       Object object1 = item$iv$iv; Collection collection6 = destination$iv$iv; int $i$a$-map-Problem$withOffset$3 = 0; ProblemFix.Part[] arrayOfPart1 = object1.getParts(); Object object2 = object1; int i1 = 0;
/* 183 */       ProblemFix.Part[] arrayOfPart2 = arrayOfPart1; Collection collection5 = new ArrayList(arrayOfPart1.length); int i2 = 0;
/* 184 */       boolean bool = false; int i3 = arrayOfPart2.length; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 191 */     List list4 = (List)destination$iv$iv, list1 = list4;
/*     */     int $i$f$toTypedArray = 0;
/* 193 */     Collection thisCollection$iv = list1;
/*     */     
/* 195 */     return copy$default(problem, kindInfo, str, problemHighlighting, (ProblemFix[])thisCollection$iv.toArray((Object[])new ProblemFix[0]), null, null, null, 115, null); }
/*     */ 
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (other == null || getClass() != other.getClass())
/*     */       return false; 
/*     */     (Problem)other;
/*     */     if (!Intrinsics.areEqual(this.info, ((Problem)other).info))
/*     */       return false; 
/*     */     if (!Intrinsics.areEqual(this.message, ((Problem)other).message))
/*     */       return false; 
/*     */     if (!Intrinsics.areEqual(this.highlighting, ((Problem)other).highlighting))
/*     */       return false; 
/*     */     if (!Arrays.equals((Object[])this.fixes, (Object[])((Problem)other).fixes))
/*     */       return false; 
/*     */     if (!Arrays.equals((Object[])this.actionSuggestions, (Object[])((Problem)other).actionSuggestions))
/*     */       return false; 
/*     */     if (!Intrinsics.areEqual(this.experimental, ((Problem)other).experimental))
/*     */       return false; 
/*     */     return Intrinsics.areEqual(this.condition, ((Problem)other).condition);
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     int result = this.info.hashCode();
/*     */     result = 31 * result + this.message.hashCode();
/*     */     result = 31 * result + this.highlighting.hashCode();
/*     */     result = 31 * result + Arrays.hashCode((Object[])this.fixes);
/*     */     result = 31 * result + Arrays.hashCode((Object[])this.actionSuggestions);
/*     */     result = 31 * result + ((this.experimental != null) ? this.experimental.hashCode() : 0);
/*     */     result = 31 * result + ((this.condition != null) ? this.condition.hashCode() : 0);
/*     */     return result;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ProblemConditionAnalyzer analyzeCondition() {
/*     */     if (((this.condition != null) ? this.condition.getMap() : null) == null)
/*     */       (this.condition != null) ? this.condition.getMap() : null; 
/*     */     super(MapsKt.emptyMap());
/*     */     return new ProblemConditionAnalyzer();
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final KindInfo component1() {
/*     */     return this.info;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final String component2() {
/*     */     return this.message;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ProblemHighlighting component3() {
/*     */     return this.highlighting;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ProblemFix[] component4() {
/*     */     return this.fixes;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final StringProperties component5() {
/*     */     return this.experimental;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final StringProperties component6() {
/*     */     return this.condition;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final ActionSuggestion[] component7() {
/*     */     return this.actionSuggestions;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Problem copy(@NotNull KindInfo info, @NotNull String message, @NotNull ProblemHighlighting highlighting, @NotNull ProblemFix[] fixes, @Nullable StringProperties experimental, @Nullable StringProperties condition, @Nullable ActionSuggestion[] actionSuggestions) {
/*     */     Intrinsics.checkNotNullParameter(info, "info");
/*     */     Intrinsics.checkNotNullParameter(message, "message");
/*     */     Intrinsics.checkNotNullParameter(highlighting, "highlighting");
/*     */     Intrinsics.checkNotNullParameter(fixes, "fixes");
/*     */     return new Problem(info, message, highlighting, fixes, experimental, condition, actionSuggestions);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "Problem(info=" + this.info + ", message=" + this.message + ", highlighting=" + this.highlighting + ", fixes=" + Arrays.toString((Object[])this.fixes) + ", experimental=" + this.experimental + ", condition=" + this.condition + ", actionSuggestions=" + Arrays.toString((Object[])this.actionSuggestions) + ")";
/*     */   }
/*     */   
/*     */   @Serializable(with = Confidence.Serializer.class)
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\006\b\001\030\000 \0052\b\022\004\022\0020\0000\001:\002\005\006B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004¨\006\007"}, d2 = {"Lai/grazie/gec/model/problem/Problem$Confidence;", "", "(Ljava/lang/String;I)V", "HIGH", "LOW", "Companion", "Serializer", "model-gec"})
/*     */   public enum Confidence {
/*     */     HIGH, LOW;
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/Problem$Confidence$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/Problem$Confidence;", "model-gec"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<Problem.Confidence> serializer() {
/*     */         return (KSerializer<Problem.Confidence>)Problem.Confidence.Serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     static {
/*     */     
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\020\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003¨\006\004"}, d2 = {"Lai/grazie/gec/model/problem/Problem$Confidence$Serializer;", "Lai/grazie/utils/StringValueClassSerializer;", "Lai/grazie/gec/model/problem/Problem$Confidence;", "()V", "model-gec"})
/*     */     public static final class Serializer extends StringValueClassSerializer<Confidence> {
/*     */       @NotNull
/*     */       public static final Serializer INSTANCE = new Serializer();
/*     */       
/*     */       private Serializer() {
/*     */         super("Confidence", null.INSTANCE, null.INSTANCE);
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\Problem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */