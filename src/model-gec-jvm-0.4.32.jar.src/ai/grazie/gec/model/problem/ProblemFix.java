/*     */ package ai.grazie.gec.model.problem;
/*     */ import ai.grazie.text.TextRange;
/*     */ import java.util.Collection;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.DeserializationStrategy;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.CompositeDecoder;
/*     */ import kotlinx.serialization.encoding.CompositeEncoder;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
/*     */ import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Serializable
/*     */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000P\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\021\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\017\n\002\020\013\n\002\b\005\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 /2\0020\001:\003./0B=\b\021\022\006\020\002\032\0020\003\022\016\020\004\032\n\022\004\022\0020\006\030\0010\005\022\b\020\007\032\004\030\0010\b\022\b\020\t\032\004\030\0010\b\022\b\020\n\032\004\030\0010\013¢\006\002\020\fB-\b\007\022\f\020\004\032\b\022\004\022\0020\0060\005\022\n\b\002\020\007\032\004\030\0010\b\022\n\b\002\020\t\032\004\030\0010\b¢\006\002\020\rJ\016\020\030\032\0020\b2\006\020\031\032\0020\bJ\024\020\032\032\b\022\004\022\0020\0060\005HÆ\003¢\006\002\020\026J\013\020\033\032\004\030\0010\bHÆ\003J\013\020\034\032\004\030\0010\bHÆ\003J6\020\035\032\0020\0002\016\b\002\020\004\032\b\022\004\022\0020\0060\0052\n\b\002\020\007\032\004\030\0010\b2\n\b\002\020\t\032\004\030\0010\bHÆ\001¢\006\002\020\036J\020\020\037\032\0020\b2\b\b\002\020 \032\0020!J\023\020\"\032\0020!2\b\020#\032\004\030\0010\001H\002J\b\020$\032\0020\003H\026J\t\020%\032\0020\bHÖ\001J&\020&\032\0020'2\006\020(\032\0020\0002\006\020)\032\0020*2\006\020+\032\0020,HÁ\001¢\006\002\b-R\023\020\007\032\004\030\0010\b¢\006\b\n\000\032\004\b\016\020\017R\027\020\020\032\b\022\004\022\0020\0210\0058F¢\006\006\032\004\b\022\020\023R\023\020\t\032\004\030\0010\b¢\006\b\n\000\032\004\b\024\020\017R\031\020\004\032\b\022\004\022\0020\0060\005¢\006\n\n\002\020\027\032\004\b\025\020\026¨\0061"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix;", "", "seen1", "", "parts", "", "Lai/grazie/gec/model/problem/ProblemFix$Part;", "batchId", "", "customDisplayName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[Lai/grazie/gec/model/problem/ProblemFix$Part;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([Lai/grazie/gec/model/problem/ProblemFix$Part;Ljava/lang/String;Ljava/lang/String;)V", "getBatchId", "()Ljava/lang/String;", "changes", "Lai/grazie/gec/model/problem/ProblemFix$Part$Change;", "getChanges", "()[Lai/grazie/gec/model/problem/ProblemFix$Part$Change;", "getCustomDisplayName", "getParts", "()[Lai/grazie/gec/model/problem/ProblemFix$Part;", "[Lai/grazie/gec/model/problem/ProblemFix$Part;", "apply", "sentence", "component1", "component2", "component3", "copy", "([Lai/grazie/gec/model/problem/ProblemFix$Part;Ljava/lang/String;Ljava/lang/String;)Lai/grazie/gec/model/problem/ProblemFix;", "display", "withBlankSymbolsVisualized", "", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "Part", "model-gec"})
/*     */ @SourceDebugExtension({"SMAP\nProblemFix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProblemFix.kt\nai/grazie/gec/model/problem/ProblemFix\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,133:1\n11158#2:134\n11493#2,3:135\n4135#2,11:138\n4135#2,11:154\n11493#2,3:166\n1053#3:149\n1062#3:165\n37#4:150\n36#4,3:151\n*S KotlinDebug\n*F\n+ 1 ProblemFix.kt\nai/grazie/gec/model/problem/ProblemFix\n*L\n28#1:134\n28#1:135,3\n40#1:138,11\n45#1:154,11\n28#1:166,3\n40#1:149\n45#1:165\n40#1:150\n40#1:151,3\n*E\n"})
/*     */ public final class ProblemFix {
/*     */   @NotNull
/*  21 */   public static final Companion Companion = new Companion(null); @NotNull private final Part[] parts; @Nullable private final String batchId; @Nullable
/*     */   private final String customDisplayName; @JvmOverloads
/*  23 */   public ProblemFix(@NotNull Part[] parts, @Nullable String batchId, @Nullable String customDisplayName) { this.parts = parts; this.batchId = batchId; this.customDisplayName = customDisplayName;
/*     */ 
/*     */     
/*  26 */     for (Pair pair : CollectionsKt.zipWithNext(ArraysKt.toList((Object[])getChanges()))) { Part.Change c1 = (Part.Change)pair.component1(), c2 = (Part.Change)pair.component2();
/*  27 */       if (c1.getRange().getEndExclusive() >= c2.getRange().getStart())
/*  28 */       { Part.Change[] arrayOfChange1 = getChanges(); int $i$f$map = 0;
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
/* 134 */         Part.Change[] arrayOfChange2 = arrayOfChange1; Collection<TextRange> destination$iv$iv = new ArrayList(arrayOfChange1.length); int $i$f$mapTo = 0; byte b; int i;
/* 135 */         for (b = 0, i = arrayOfChange2.length; b < i; ) { Object item$iv$iv = arrayOfChange2[b];
/* 136 */           Object object1 = item$iv$iv; Collection<TextRange> collection = destination$iv$iv; int $i$a$-map-ProblemFix$1 = 0; collection.add(object1.getRange()); }
/* 137 */          String str = "Intersecting changes: " + (List)destination$iv$iv; throw new IllegalArgumentException(str); }  }  } @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Part.class), Part.Companion.serializer()); arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = null; $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/ProblemFix.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/ProblemFix;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<ProblemFix> {
/* 138 */     @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])ProblemFix.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = arrayOfKSerializer1[0]; arrayOfKSerializer2[1] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); arrayOfKSerializer2[2] = BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE); return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public ProblemFix deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; ProblemFix.Part[] arrayOfPart = null; String str1 = null, str2 = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])ProblemFix.$childSerializers; if (compositeDecoder.decodeSequentially()) { arrayOfPart = (ProblemFix.Part[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfPart); i |= 0x1; str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x2; str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: arrayOfPart = (ProblemFix.Part[])compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], arrayOfPart); i |= 0x1; continue;case 1: str1 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, str1); i |= 0x2; continue;case 2: str2 = (String)compositeDecoder.decodeNullableSerializableElement(serialDescriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, str2); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new ProblemFix(i, arrayOfPart, str1, str2, null); } public void serialize(@NotNull Encoder encoder, @NotNull ProblemFix value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); ProblemFix.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.problem.ProblemFix", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("parts", false); pluginGeneratedSerialDescriptor.addElement("batchId", true); pluginGeneratedSerialDescriptor.addElement("customDisplayName", true); descriptor = pluginGeneratedSerialDescriptor; } } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemFix;", "model-gec"}) public static final class Companion { private Companion() {} @NotNull public final KSerializer<ProblemFix> serializer() { return (KSerializer<ProblemFix>)ProblemFix.$serializer.INSTANCE; } } @NotNull public final Part[] getParts() { return this.parts; } @Nullable public final String getBatchId() { return this.batchId; } @NotNull public final Part.Change[] getChanges() { Part[] arrayOfPart1 = this.parts; int $i$f$filterIsInstance = 0; Part[] arrayOfPart2 = arrayOfPart1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */     
/*     */     byte b;
/*     */ 
/*     */     
/*     */     int i;
/*     */ 
/*     */     
/* 147 */     for (b = 0, i = arrayOfPart2.length; b < i; ) { Object element$iv$iv = arrayOfPart2[b]; if (element$iv$iv instanceof Part.Change) destination$iv$iv.add(element$iv$iv);  b++; }
/* 148 */      List list = (List)destination$iv$iv; int $i$f$sortedBy = 0;
/* 149 */     Iterable $this$sortedBy$iv = CollectionsKt.sortedWith(list, new ProblemFix$special$$inlined$sortedBy$1());
/*     */     int $i$f$toTypedArray = 0;
/* 151 */     Iterable iterable1 = $this$sortedBy$iv;
/*     */     
/* 153 */     return (Part.Change[])iterable1.toArray((Object[])new Part.Change[0]); } @Nullable public final String getCustomDisplayName() { return this.customDisplayName; } @JvmOverloads public ProblemFix(@NotNull Part[] parts, @Nullable String batchId) { this(parts, batchId, (String)null, 4, (DefaultConstructorMarker)null); } @JvmOverloads public ProblemFix(@NotNull Part[] parts) { this(parts, (String)null, (String)null, 6, (DefaultConstructorMarker)null); } @NotNull public final String display(boolean withBlankSymbolsVisualized) { return ArraysKt.joinToString$default((Object[])this.parts, " ", null, null, 0, null, new ProblemFix$display$1(withBlankSymbolsVisualized), 30, null); } @Metadata(mv = {1, 7, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Lai/grazie/gec/model/problem/ProblemFix$Part;", "invoke"}) static final class ProblemFix$display$1 extends Lambda implements Function1<Part, CharSequence> {
/* 154 */     public final CharSequence invoke(ProblemFix.Part it) { Intrinsics.checkNotNullParameter(it, "it"); return (this.$withBlankSymbolsVisualized && StringsKt.isBlank(it.getDisplay())) ? BlankSymbols.INSTANCE.visualize(it.getDisplay()) : it.getDisplay(); } ProblemFix$display$1(boolean $withBlankSymbolsVisualized) { super(1); } } @NotNull public final String apply(@NotNull String sentence) { Intrinsics.checkNotNullParameter(sentence, "sentence"); String result = sentence; Part[] arrayOfPart1 = this.parts; int $i$f$filterIsInstance = 0; Part[] arrayOfPart2 = arrayOfPart1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */     
/*     */     byte b;
/*     */ 
/*     */     
/*     */     int i;
/*     */ 
/*     */     
/* 163 */     for (b = 0, i = arrayOfPart2.length; b < i; ) { Object element$iv$iv = arrayOfPart2[b]; if (element$iv$iv instanceof Part.Change) destination$iv$iv.add(element$iv$iv);  b++; }
/* 164 */      List list = (List)destination$iv$iv; int $i$f$sortedByDescending = 0;
/* 165 */     for (Part.Change part : CollectionsKt.sortedWith(list, new ProblemFix$apply$$inlined$sortedByDescending$1()))
/*     */       result = part.apply(result); 
/*     */     return result; }
/*     */ 
/*     */   
/*     */   @Serializable
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\030\002\n\002\030\002\n\000\b7\030\000 \0302\0020\001:\005\027\030\031\032\033B\031\b\027\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005¢\006\002\020\006B\007\b\004¢\006\002\020\007J!\020\020\032\0020\0212\006\020\022\032\0020\0002\006\020\023\032\0020\0242\006\020\025\032\0020\026HÇ\001R\022\020\b\032\0020\tX¦\004¢\006\006\032\004\b\n\020\013R\022\020\f\032\0020\rX¦\004¢\006\006\032\004\b\016\020\017\001\003\034\035\036¨\006\037"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part;", "", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "display", "", "getDisplay", "()Ljava/lang/String;", "kind", "Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "getKind", "()Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Change", "Companion", "Context", "PartKind", "Skip", "Lai/grazie/gec/model/problem/ProblemFix$Part$Change;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Context;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Skip;", "model-gec"})
/*     */   public static abstract class Part {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE);
/*     */     
/*     */     private Part() {}
/*     */     
/*     */     @NotNull
/*     */     public abstract PartKind getKind();
/*     */     
/*     */     @NotNull
/*     */     public abstract String getDisplay();
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */     static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*     */       public static final null INSTANCE = (null)new Function0<>();
/*     */       
/*     */       null() {
/*     */         super(0);
/*     */       }
/*     */       
/*     */       public final KSerializer<Object> invoke() {
/*     */         KClass[] arrayOfKClass = new KClass[3];
/*     */         arrayOfKClass[0] = Reflection.getOrCreateKotlinClass(ProblemFix.Part.Change.class);
/*     */         arrayOfKClass[1] = Reflection.getOrCreateKotlinClass(ProblemFix.Part.Context.class);
/*     */         arrayOfKClass[2] = Reflection.getOrCreateKotlinClass(ProblemFix.Part.Skip.class);
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*     */         arrayOfKSerializer[0] = (KSerializer)ProblemFix.Part.Change.$serializer.INSTANCE;
/*     */         arrayOfKSerializer[1] = (KSerializer)ProblemFix.Part.Context.$serializer.INSTANCE;
/*     */         arrayOfKSerializer[2] = (KSerializer)ProblemFix.Part.Skip.$serializer.INSTANCE;
/*     */         return (KSerializer<Object>)new SealedClassSerializer("ai.grazie.gec.model.problem.ProblemFix.Part", Reflection.getOrCreateKotlinClass(ProblemFix.Part.class), arrayOfKClass, arrayOfKSerializer, new java.lang.annotation.Annotation[0]);
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part;", "model-gec"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<ProblemFix.Part> serializer() {
/*     */         return get$cachedSerializer();
/*     */       }
/*     */     }
/*     */     
/*     */     @Serializable
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\006\b\001\030\000 \0062\b\022\004\022\0020\0000\001:\001\006B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\007"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "", "(Ljava/lang/String;I)V", "CHANGE", "CONTEXT", "SKIP", "Companion", "model-gec"})
/*     */     public enum PartKind {
/*     */       CHANGE, CONTEXT, SKIP;
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       @NotNull
/*     */       private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, Companion.null.INSTANCE);
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 3, xi = 48)
/*     */       static final class null extends Lambda implements Function0<KSerializer<Object>> {
/*     */         public static final null INSTANCE = (null)new Function0<>();
/*     */         
/*     */         null() {
/*     */           super(0);
/*     */         }
/*     */         
/*     */         public final KSerializer<Object> invoke() {
/*     */           return EnumsKt.createSimpleEnumSerializer("ai.grazie.gec.model.problem.ProblemFix.Part.PartKind", (Enum[])ProblemFix.Part.PartKind.values());
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "model-gec"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<ProblemFix.Part.PartKind> serializer() {
/*     */           return get$cachedSerializer();
/*     */         }
/*     */       }
/*     */       
/*     */       static {
/*     */       
/*     */       }
/*     */     }
/*     */     
/*     */     @Serializable
/*     */     @SerialName("Skip")
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\007\n\002\020\013\n\000\n\002\020\000\n\002\b\002\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\007\030\000 \0362\0020\001:\002\035\036B-\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t¢\006\002\020\nB\005¢\006\002\020\013J\023\020\020\032\0020\0212\b\020\022\032\004\030\0010\023H\002J\b\020\024\032\0020\003H\026J&\020\025\032\0020\0262\006\020\027\032\0020\0002\006\020\030\032\0020\0312\006\020\032\032\0020\033HÁ\001¢\006\002\b\034R\024\020\006\032\0020\007XD¢\006\b\n\000\032\004\b\f\020\rR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\016\020\017¨\006\037"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Skip;", "Lai/grazie/gec/model/problem/ProblemFix$Part;", "seen1", "", "kind", "Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "display", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/gec/model/problem/ProblemFix$Part$PartKind;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getDisplay", "()Ljava/lang/String;", "getKind", "()Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "equals", "", "other", "", "hashCode", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "model-gec"})
/*     */     public static final class Skip extends Part {
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       @NotNull
/*     */       private final ProblemFix.Part.PartKind kind;
/*     */       @NotNull
/*     */       private final String display;
/*     */       @JvmField
/*     */       @NotNull
/*     */       private static final KSerializer<Object>[] $childSerializers;
/*     */       
/*     */       static {
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[2];
/*     */         arrayOfKSerializer[0] = ProblemFix.Part.PartKind.Companion.serializer();
/*     */         arrayOfKSerializer[1] = null;
/*     */         $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */       }
/*     */       
/*     */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/ProblemFix.Part.Skip.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Skip;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"})
/*     */       public static final class $serializer implements GeneratedSerializer<Skip> {
/*     */         @NotNull
/*     */         public static final $serializer INSTANCE = new $serializer();
/*     */         
/*     */         @NotNull
/*     */         public KSerializer<?>[] typeParametersSerializers() {
/*     */           return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public SerialDescriptor getDescriptor() {
/*     */           return (SerialDescriptor)descriptor;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public KSerializer<?>[] childSerializers() {
/*     */           KSerializer[] arrayOfKSerializer1 = (KSerializer[])ProblemFix.Part.Skip.$childSerializers, arrayOfKSerializer2 = new KSerializer[2];
/*     */           arrayOfKSerializer2[0] = arrayOfKSerializer1[0];
/*     */           arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*     */           return (KSerializer<?>[])arrayOfKSerializer2;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public ProblemFix.Part.Skip deserialize(@NotNull Decoder decoder) {
/*     */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           boolean bool = true;
/*     */           int i = 0;
/*     */           ProblemFix.Part.PartKind partKind = null;
/*     */           String str = null;
/*     */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */           KSerializer[] arrayOfKSerializer = (KSerializer[])ProblemFix.Part.Skip.$childSerializers;
/*     */           if (compositeDecoder.decodeSequentially()) {
/*     */             partKind = (ProblemFix.Part.PartKind)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], partKind);
/*     */             i |= 0x1;
/*     */             str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */             i |= 0x2;
/*     */           } else {
/*     */             while (bool) {
/*     */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */               switch (j) {
/*     */                 case -1:
/*     */                   bool = false;
/*     */                   continue;
/*     */                 case 0:
/*     */                   partKind = (ProblemFix.Part.PartKind)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)arrayOfKSerializer[0], partKind);
/*     */                   i |= 0x1;
/*     */                   continue;
/*     */                 case 1:
/*     */                   str = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */                   i |= 0x2;
/*     */                   continue;
/*     */               } 
/*     */               throw new UnknownFieldException(j);
/*     */             } 
/*     */           } 
/*     */           compositeDecoder.endStructure(serialDescriptor);
/*     */           return new ProblemFix.Part.Skip(i, partKind, str, null);
/*     */         }
/*     */         
/*     */         public void serialize(@NotNull Encoder encoder, @NotNull ProblemFix.Part.Skip value) {
/*     */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */           Intrinsics.checkNotNullParameter(value, "value");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */           ProblemFix.Part.Skip.write$Self$model_gec(value, compositeEncoder, serialDescriptor);
/*     */           compositeEncoder.endStructure(serialDescriptor);
/*     */         }
/*     */         
/*     */         static {
/*     */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Skip", INSTANCE, 2);
/*     */           pluginGeneratedSerialDescriptor.addElement("kind", true);
/*     */           pluginGeneratedSerialDescriptor.addElement("display", true);
/*     */           descriptor = pluginGeneratedSerialDescriptor;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Skip$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Skip;", "model-gec"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<ProblemFix.Part.Skip> serializer() {
/*     */           return (KSerializer<ProblemFix.Part.Skip>)ProblemFix.Part.Skip.$serializer.INSTANCE;
/*     */         }
/*     */       }
/*     */       
/*     */       public Skip() {
/*     */         super(null);
/*     */         this.kind = ProblemFix.Part.PartKind.SKIP;
/*     */         this.display = "…";
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public ProblemFix.Part.PartKind getKind() {
/*     */         return this.kind;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String getDisplay() {
/*     */         return this.display;
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         return other instanceof Skip;
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         return ProblemFix.Part.PartKind.SKIP.hashCode();
/*     */       }
/*     */     }
/*     */     
/*     */     @Serializable
/*     */     @SerialName("Context")
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\n\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 #2\0020\001:\002\"#B7\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\005\022\b\020\t\032\004\030\0010\n¢\006\002\020\013B\r\022\006\020\004\032\0020\005¢\006\002\020\fJ\t\020\022\032\0020\005HÆ\003J\023\020\023\032\0020\0002\b\b\002\020\004\032\0020\005HÆ\001J\023\020\024\032\0020\0252\b\020\026\032\004\030\0010\027HÖ\003J\t\020\030\032\0020\003HÖ\001J\t\020\031\032\0020\005HÖ\001J&\020\032\032\0020\0332\006\020\034\032\0020\0002\006\020\035\032\0020\0362\006\020\037\032\0020 HÁ\001¢\006\002\b!R\024\020\b\032\0020\005X\004¢\006\b\n\000\032\004\b\r\020\016R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\017\020\020R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\021\020\016¨\006$"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Context;", "Lai/grazie/gec/model/problem/ProblemFix$Part;", "seen1", "", "text", "", "kind", "Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "display", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "getKind", "()Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "getText", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "model-gec"})
/*     */     public static final class Context extends Part {
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       @NotNull
/*     */       private final String text;
/*     */       @NotNull
/*     */       private final ProblemFix.Part.PartKind kind;
/*     */       @NotNull
/*     */       private final String display;
/*     */       @JvmField
/*     */       @NotNull
/*     */       private static final KSerializer<Object>[] $childSerializers;
/*     */       
/*     */       static {
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[3];
/*     */         arrayOfKSerializer[0] = null;
/*     */         arrayOfKSerializer[1] = ProblemFix.Part.PartKind.Companion.serializer();
/*     */         arrayOfKSerializer[2] = null;
/*     */         $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */       }
/*     */       
/*     */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/ProblemFix.Part.Context.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Context;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"})
/*     */       public static final class $serializer implements GeneratedSerializer<Context> {
/*     */         @NotNull
/*     */         public static final $serializer INSTANCE = new $serializer();
/*     */         
/*     */         @NotNull
/*     */         public KSerializer<?>[] typeParametersSerializers() {
/*     */           return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public SerialDescriptor getDescriptor() {
/*     */           return (SerialDescriptor)descriptor;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public KSerializer<?>[] childSerializers() {
/*     */           KSerializer[] arrayOfKSerializer1 = (KSerializer[])ProblemFix.Part.Context.$childSerializers, arrayOfKSerializer2 = new KSerializer[3];
/*     */           arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE;
/*     */           arrayOfKSerializer2[1] = arrayOfKSerializer1[1];
/*     */           arrayOfKSerializer2[2] = (KSerializer)StringSerializer.INSTANCE;
/*     */           return (KSerializer<?>[])arrayOfKSerializer2;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public ProblemFix.Part.Context deserialize(@NotNull Decoder decoder) {
/*     */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           boolean bool = true;
/*     */           int i = 0;
/*     */           String str1 = null;
/*     */           ProblemFix.Part.PartKind partKind = null;
/*     */           String str2 = null;
/*     */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */           KSerializer[] arrayOfKSerializer = (KSerializer[])ProblemFix.Part.Context.$childSerializers;
/*     */           if (compositeDecoder.decodeSequentially()) {
/*     */             str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */             i |= 0x1;
/*     */             partKind = (ProblemFix.Part.PartKind)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], partKind);
/*     */             i |= 0x2;
/*     */             str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */             i |= 0x4;
/*     */           } else {
/*     */             while (bool) {
/*     */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */               switch (j) {
/*     */                 case -1:
/*     */                   bool = false;
/*     */                   continue;
/*     */                 case 0:
/*     */                   str1 = compositeDecoder.decodeStringElement(serialDescriptor, 0);
/*     */                   i |= 0x1;
/*     */                   continue;
/*     */                 case 1:
/*     */                   partKind = (ProblemFix.Part.PartKind)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)arrayOfKSerializer[1], partKind);
/*     */                   i |= 0x2;
/*     */                   continue;
/*     */                 case 2:
/*     */                   str2 = compositeDecoder.decodeStringElement(serialDescriptor, 2);
/*     */                   i |= 0x4;
/*     */                   continue;
/*     */               } 
/*     */               throw new UnknownFieldException(j);
/*     */             } 
/*     */           } 
/*     */           compositeDecoder.endStructure(serialDescriptor);
/*     */           return new ProblemFix.Part.Context(i, str1, partKind, str2, null);
/*     */         }
/*     */         
/*     */         public void serialize(@NotNull Encoder encoder, @NotNull ProblemFix.Part.Context value) {
/*     */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */           Intrinsics.checkNotNullParameter(value, "value");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */           ProblemFix.Part.Context.write$Self$model_gec(value, compositeEncoder, serialDescriptor);
/*     */           compositeEncoder.endStructure(serialDescriptor);
/*     */         }
/*     */         
/*     */         static {
/*     */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Context", INSTANCE, 3);
/*     */           pluginGeneratedSerialDescriptor.addElement("text", false);
/*     */           pluginGeneratedSerialDescriptor.addElement("kind", true);
/*     */           pluginGeneratedSerialDescriptor.addElement("display", true);
/*     */           descriptor = pluginGeneratedSerialDescriptor;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Context$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Context;", "model-gec"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<ProblemFix.Part.Context> serializer() {
/*     */           return (KSerializer<ProblemFix.Part.Context>)ProblemFix.Part.Context.$serializer.INSTANCE;
/*     */         }
/*     */       }
/*     */       
/*     */       public Context(@NotNull String text) {
/*     */         super(null);
/*     */         this.text = text;
/*     */         this.kind = ProblemFix.Part.PartKind.CONTEXT;
/*     */         this.display = this.text;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String getText() {
/*     */         return this.text;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public ProblemFix.Part.PartKind getKind() {
/*     */         return this.kind;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String getDisplay() {
/*     */         return this.display;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String component1() {
/*     */         return this.text;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Context copy(@NotNull String text) {
/*     */         Intrinsics.checkNotNullParameter(text, "text");
/*     */         return new Context(text);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "Context(text=" + this.text + ")";
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         return this.text.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof Context))
/*     */           return false; 
/*     */         Context context = (Context)other;
/*     */         return !!Intrinsics.areEqual(this.text, context.text);
/*     */       }
/*     */     }
/*     */     
/*     */     @Serializable
/*     */     @SerialName("Change")
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 /2\0020\001:\003-./BA\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\007\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\016J\016\020\032\032\0020\0072\006\020\033\032\0020\007J\t\020\034\032\0020\005HÆ\003J\t\020\035\032\0020\007HÆ\003J\035\020\036\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\037\032\0020 2\b\020!\032\004\030\0010\"HÖ\003J\t\020#\032\0020\003HÖ\001J\t\020$\032\0020\007HÖ\001J&\020%\032\0020&2\006\020'\032\0020\0002\006\020(\032\0020)2\006\020*\032\0020+HÁ\001¢\006\002\b,R\024\020\n\032\0020\007X\004¢\006\b\n\000\032\004\b\017\020\020R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\021\020\022R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\023\020\024R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\025\020\020R\021\020\026\032\0020\0278F¢\006\006\032\004\b\030\020\031¨\0060"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Change;", "Lai/grazie/gec/model/problem/ProblemFix$Part;", "seen1", "", "range", "Lai/grazie/text/TextRange;", "text", "", "kind", "Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "display", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/text/TextRange;Ljava/lang/String;Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/text/TextRange;Ljava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "getKind", "()Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "getRange", "()Lai/grazie/text/TextRange;", "getText", "type", "Lai/grazie/gec/model/problem/ProblemFix$Part$Change$ChangeType;", "getType", "()Lai/grazie/gec/model/problem/ProblemFix$Part$Change$ChangeType;", "apply", "sentence", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "ChangeType", "Companion", "model-gec"})
/*     */     @SourceDebugExtension({"SMAP\nProblemFix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProblemFix.kt\nai/grazie/gec/model/problem/ProblemFix$Part$Change\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/*     */     public static final class Change extends Part {
/*     */       @NotNull
/*     */       public static final Companion Companion = new Companion(null);
/*     */       @NotNull
/*     */       private final TextRange range;
/*     */       @NotNull
/*     */       private final String text;
/*     */       @NotNull
/*     */       private final ProblemFix.Part.PartKind kind;
/*     */       @NotNull
/*     */       private final String display;
/*     */       @JvmField
/*     */       @NotNull
/*     */       private static final KSerializer<Object>[] $childSerializers;
/*     */       
/*     */       static {
/*     */         KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*     */         arrayOfKSerializer[0] = null;
/*     */         arrayOfKSerializer[1] = null;
/*     */         arrayOfKSerializer[2] = ProblemFix.Part.PartKind.Companion.serializer();
/*     */         arrayOfKSerializer[3] = null;
/*     */         $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */       }
/*     */       
/*     */       @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/ProblemFix.Part.Change.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Change;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"})
/*     */       public static final class $serializer implements GeneratedSerializer<Change> {
/*     */         @NotNull
/*     */         public static final $serializer INSTANCE = new $serializer();
/*     */         
/*     */         @NotNull
/*     */         public KSerializer<?>[] typeParametersSerializers() {
/*     */           return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public SerialDescriptor getDescriptor() {
/*     */           return (SerialDescriptor)descriptor;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public KSerializer<?>[] childSerializers() {
/*     */           KSerializer[] arrayOfKSerializer1 = (KSerializer[])ProblemFix.Part.Change.$childSerializers, arrayOfKSerializer2 = new KSerializer[4];
/*     */           arrayOfKSerializer2[0] = (KSerializer)TextRange$.serializer.INSTANCE;
/*     */           arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*     */           arrayOfKSerializer2[2] = arrayOfKSerializer1[2];
/*     */           arrayOfKSerializer2[3] = (KSerializer)StringSerializer.INSTANCE;
/*     */           return (KSerializer<?>[])arrayOfKSerializer2;
/*     */         }
/*     */         
/*     */         @NotNull
/*     */         public ProblemFix.Part.Change deserialize(@NotNull Decoder decoder) {
/*     */           Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           boolean bool = true;
/*     */           int i = 0;
/*     */           TextRange textRange = null;
/*     */           String str1 = null;
/*     */           ProblemFix.Part.PartKind partKind = null;
/*     */           String str2 = null;
/*     */           CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */           KSerializer[] arrayOfKSerializer = (KSerializer[])ProblemFix.Part.Change.$childSerializers;
/*     */           if (compositeDecoder.decodeSequentially()) {
/*     */             textRange = (TextRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, textRange);
/*     */             i |= 0x1;
/*     */             str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */             i |= 0x2;
/*     */             partKind = (ProblemFix.Part.PartKind)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], partKind);
/*     */             i |= 0x4;
/*     */             str2 = compositeDecoder.decodeStringElement(serialDescriptor, 3);
/*     */             i |= 0x8;
/*     */           } else {
/*     */             while (bool) {
/*     */               int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */               switch (j) {
/*     */                 case -1:
/*     */                   bool = false;
/*     */                   continue;
/*     */                 case 0:
/*     */                   textRange = (TextRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, textRange);
/*     */                   i |= 0x1;
/*     */                   continue;
/*     */                 case 1:
/*     */                   str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */                   i |= 0x2;
/*     */                   continue;
/*     */                 case 2:
/*     */                   partKind = (ProblemFix.Part.PartKind)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], partKind);
/*     */                   i |= 0x4;
/*     */                   continue;
/*     */                 case 3:
/*     */                   str2 = compositeDecoder.decodeStringElement(serialDescriptor, 3);
/*     */                   i |= 0x8;
/*     */                   continue;
/*     */               } 
/*     */               throw new UnknownFieldException(j);
/*     */             } 
/*     */           } 
/*     */           compositeDecoder.endStructure(serialDescriptor);
/*     */           return new ProblemFix.Part.Change(i, textRange, str1, partKind, str2, null);
/*     */         }
/*     */         
/*     */         public void serialize(@NotNull Encoder encoder, @NotNull ProblemFix.Part.Change value) {
/*     */           Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */           Intrinsics.checkNotNullParameter(value, "value");
/*     */           SerialDescriptor serialDescriptor = getDescriptor();
/*     */           CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */           ProblemFix.Part.Change.write$Self$model_gec(value, compositeEncoder, serialDescriptor);
/*     */           compositeEncoder.endStructure(serialDescriptor);
/*     */         }
/*     */         
/*     */         static {
/*     */           PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Change", INSTANCE, 4);
/*     */           pluginGeneratedSerialDescriptor.addElement("range", false);
/*     */           pluginGeneratedSerialDescriptor.addElement("text", false);
/*     */           pluginGeneratedSerialDescriptor.addElement("kind", true);
/*     */           pluginGeneratedSerialDescriptor.addElement("display", true);
/*     */           descriptor = pluginGeneratedSerialDescriptor;
/*     */         }
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Change$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Change;", "model-gec"})
/*     */       public static final class Companion {
/*     */         private Companion() {}
/*     */         
/*     */         @NotNull
/*     */         public final KSerializer<ProblemFix.Part.Change> serializer() {
/*     */           return (KSerializer<ProblemFix.Part.Change>)ProblemFix.Part.Change.$serializer.INSTANCE;
/*     */         }
/*     */       }
/*     */       
/*     */       public Change(@NotNull TextRange range, @NotNull String text) {
/*     */         super(null);
/*     */         this.range = range;
/*     */         this.text = text;
/*     */         if (!((this.range.getStart() >= 0) ? 1 : 0)) {
/*     */           int $i$a$-require-ProblemFix$Part$Change$1 = 0;
/*     */           String str = "Negative change start: " + this.range;
/*     */           throw new IllegalArgumentException(str.toString());
/*     */         } 
/*     */         this.kind = ProblemFix.Part.PartKind.CHANGE;
/*     */         this.display = this.text;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final TextRange getRange() {
/*     */         return this.range;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String getText() {
/*     */         return this.text;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public ProblemFix.Part.PartKind getKind() {
/*     */         return this.kind;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String getDisplay() {
/*     */         return this.display;
/*     */       }
/*     */       
/*     */       @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Change$ChangeType;", "", "(Ljava/lang/String;I)V", "INSERT", "REPLACE", "REMOVE", "model-gec"})
/*     */       public enum ChangeType {
/*     */         INSERT, REPLACE, REMOVE;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String apply(@NotNull String sentence) {
/*     */         Intrinsics.checkNotNullParameter(sentence, "sentence");
/*     */         return ExtensionsKt.replace(sentence, this.range, this.text);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final ChangeType getType() {
/*     */         if ((((CharSequence)this.text).length() == 0))
/*     */           return ChangeType.REMOVE; 
/*     */         if (this.range.isEmpty())
/*     */           return ChangeType.INSERT; 
/*     */         return ChangeType.REPLACE;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final TextRange component1() {
/*     */         return this.range;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final String component2() {
/*     */         return this.text;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public final Change copy(@NotNull TextRange range, @NotNull String text) {
/*     */         Intrinsics.checkNotNullParameter(range, "range");
/*     */         Intrinsics.checkNotNullParameter(text, "text");
/*     */         return new Change(range, text);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public String toString() {
/*     */         return "Change(range=" + this.range + ", text=" + this.text + ")";
/*     */       }
/*     */       
/*     */       public int hashCode() {
/*     */         result = this.range.hashCode();
/*     */         return result * 31 + this.text.hashCode();
/*     */       }
/*     */       
/*     */       public boolean equals(@Nullable Object other) {
/*     */         if (this == other)
/*     */           return true; 
/*     */         if (!(other instanceof Change))
/*     */           return false; 
/*     */         Change change = (Change)other;
/*     */         return !Intrinsics.areEqual(this.range, change.range) ? false : (!!Intrinsics.areEqual(this.text, change.text));
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part;", "model-gec"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final KSerializer<ProblemFix.Part> serializer() {
/*     */       return get$cachedSerializer();
/*     */     }
/*     */   }
/*     */   
/*     */   @Serializable
/*     */   @SerialName("Change")
/*     */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000X\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\n\n\002\030\002\n\002\b\b\n\002\020\013\n\000\n\002\020\000\n\002\b\003\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\005\b\b\030\000 /2\0020\001:\003-./BA\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\b\020\b\032\004\030\0010\t\022\b\020\n\032\004\030\0010\007\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB\025\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007¢\006\002\020\016J\016\020\032\032\0020\0072\006\020\033\032\0020\007J\t\020\034\032\0020\005HÆ\003J\t\020\035\032\0020\007HÆ\003J\035\020\036\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\007HÆ\001J\023\020\037\032\0020 2\b\020!\032\004\030\0010\"HÖ\003J\t\020#\032\0020\003HÖ\001J\t\020$\032\0020\007HÖ\001J&\020%\032\0020&2\006\020'\032\0020\0002\006\020(\032\0020)2\006\020*\032\0020+HÁ\001¢\006\002\b,R\024\020\n\032\0020\007X\004¢\006\b\n\000\032\004\b\017\020\020R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\021\020\022R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\023\020\024R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\025\020\020R\021\020\026\032\0020\0278F¢\006\006\032\004\b\030\020\031¨\0060"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Change;", "Lai/grazie/gec/model/problem/ProblemFix$Part;", "seen1", "", "range", "Lai/grazie/text/TextRange;", "text", "", "kind", "Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "display", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILai/grazie/text/TextRange;Ljava/lang/String;Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lai/grazie/text/TextRange;Ljava/lang/String;)V", "getDisplay", "()Ljava/lang/String;", "getKind", "()Lai/grazie/gec/model/problem/ProblemFix$Part$PartKind;", "getRange", "()Lai/grazie/text/TextRange;", "getText", "type", "Lai/grazie/gec/model/problem/ProblemFix$Part$Change$ChangeType;", "getType", "()Lai/grazie/gec/model/problem/ProblemFix$Part$Change$ChangeType;", "apply", "sentence", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "ChangeType", "Companion", "model-gec"})
/*     */   @SourceDebugExtension({"SMAP\nProblemFix.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProblemFix.kt\nai/grazie/gec/model/problem/ProblemFix$Part$Change\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/*     */   public static final class Change extends Part {
/*     */     @NotNull
/*     */     public static final Companion Companion = new Companion(null);
/*     */     @NotNull
/*     */     private final TextRange range;
/*     */     @NotNull
/*     */     private final String text;
/*     */     @NotNull
/*     */     private final ProblemFix.Part.PartKind kind;
/*     */     @NotNull
/*     */     private final String display;
/*     */     @JvmField
/*     */     @NotNull
/*     */     private static final KSerializer<Object>[] $childSerializers;
/*     */     
/*     */     static {
/*     */       KSerializer[] arrayOfKSerializer = new KSerializer[4];
/*     */       arrayOfKSerializer[0] = null;
/*     */       arrayOfKSerializer[1] = null;
/*     */       arrayOfKSerializer[2] = ProblemFix.Part.PartKind.Companion.serializer();
/*     */       arrayOfKSerializer[3] = null;
/*     */       $childSerializers = (KSerializer<Object>[])arrayOfKSerializer;
/*     */     }
/*     */     
/*     */     @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/ProblemFix.Part.Change.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Change;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"})
/*     */     public static final class $serializer implements GeneratedSerializer<Change> {
/*     */       @NotNull
/*     */       public static final $serializer INSTANCE = new $serializer();
/*     */       
/*     */       @NotNull
/*     */       public KSerializer<?>[] typeParametersSerializers() {
/*     */         return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public SerialDescriptor getDescriptor() {
/*     */         return (SerialDescriptor)descriptor;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public KSerializer<?>[] childSerializers() {
/*     */         KSerializer[] arrayOfKSerializer1 = (KSerializer[])ProblemFix.Part.Change.$childSerializers, arrayOfKSerializer2 = new KSerializer[4];
/*     */         arrayOfKSerializer2[0] = (KSerializer)TextRange$.serializer.INSTANCE;
/*     */         arrayOfKSerializer2[1] = (KSerializer)StringSerializer.INSTANCE;
/*     */         arrayOfKSerializer2[2] = arrayOfKSerializer1[2];
/*     */         arrayOfKSerializer2[3] = (KSerializer)StringSerializer.INSTANCE;
/*     */         return (KSerializer<?>[])arrayOfKSerializer2;
/*     */       }
/*     */       
/*     */       @NotNull
/*     */       public ProblemFix.Part.Change deserialize(@NotNull Decoder decoder) {
/*     */         Intrinsics.checkNotNullParameter(decoder, "decoder");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         boolean bool = true;
/*     */         int i = 0;
/*     */         TextRange textRange = null;
/*     */         String str1 = null;
/*     */         ProblemFix.Part.PartKind partKind = null;
/*     */         String str2 = null;
/*     */         CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor);
/*     */         KSerializer[] arrayOfKSerializer = (KSerializer[])ProblemFix.Part.Change.$childSerializers;
/*     */         if (compositeDecoder.decodeSequentially()) {
/*     */           textRange = (TextRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, textRange);
/*     */           i |= 0x1;
/*     */           str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */           i |= 0x2;
/*     */           partKind = (ProblemFix.Part.PartKind)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], partKind);
/*     */           i |= 0x4;
/*     */           str2 = compositeDecoder.decodeStringElement(serialDescriptor, 3);
/*     */           i |= 0x8;
/*     */         } else {
/*     */           while (bool) {
/*     */             int j = compositeDecoder.decodeElementIndex(serialDescriptor);
/*     */             switch (j) {
/*     */               case -1:
/*     */                 bool = false;
/*     */                 continue;
/*     */               case 0:
/*     */                 textRange = (TextRange)compositeDecoder.decodeSerializableElement(serialDescriptor, 0, (DeserializationStrategy)TextRange$.serializer.INSTANCE, textRange);
/*     */                 i |= 0x1;
/*     */                 continue;
/*     */               case 1:
/*     */                 str1 = compositeDecoder.decodeStringElement(serialDescriptor, 1);
/*     */                 i |= 0x2;
/*     */                 continue;
/*     */               case 2:
/*     */                 partKind = (ProblemFix.Part.PartKind)compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], partKind);
/*     */                 i |= 0x4;
/*     */                 continue;
/*     */               case 3:
/*     */                 str2 = compositeDecoder.decodeStringElement(serialDescriptor, 3);
/*     */                 i |= 0x8;
/*     */                 continue;
/*     */             } 
/*     */             throw new UnknownFieldException(j);
/*     */           } 
/*     */         } 
/*     */         compositeDecoder.endStructure(serialDescriptor);
/*     */         return new ProblemFix.Part.Change(i, textRange, str1, partKind, str2, null);
/*     */       }
/*     */       
/*     */       public void serialize(@NotNull Encoder encoder, @NotNull ProblemFix.Part.Change value) {
/*     */         Intrinsics.checkNotNullParameter(encoder, "encoder");
/*     */         Intrinsics.checkNotNullParameter(value, "value");
/*     */         SerialDescriptor serialDescriptor = getDescriptor();
/*     */         CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor);
/*     */         ProblemFix.Part.Change.write$Self$model_gec(value, compositeEncoder, serialDescriptor);
/*     */         compositeEncoder.endStructure(serialDescriptor);
/*     */       }
/*     */       
/*     */       static {
/*     */         PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("Change", INSTANCE, 4);
/*     */         pluginGeneratedSerialDescriptor.addElement("range", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("text", false);
/*     */         pluginGeneratedSerialDescriptor.addElement("kind", true);
/*     */         pluginGeneratedSerialDescriptor.addElement("display", true);
/*     */         descriptor = pluginGeneratedSerialDescriptor;
/*     */       }
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\026\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\017\020\003\032\b\022\004\022\0020\0050\004HÆ\001¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Change$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/gec/model/problem/ProblemFix$Part$Change;", "model-gec"})
/*     */     public static final class Companion {
/*     */       private Companion() {}
/*     */       
/*     */       @NotNull
/*     */       public final KSerializer<ProblemFix.Part.Change> serializer() {
/*     */         return (KSerializer<ProblemFix.Part.Change>)ProblemFix.Part.Change.$serializer.INSTANCE;
/*     */       }
/*     */     }
/*     */     
/*     */     public Change(@NotNull TextRange range, @NotNull String text) {
/*     */       super(null);
/*     */       this.range = range;
/*     */       this.text = text;
/*     */       if (!((this.range.getStart() >= 0) ? 1 : 0)) {
/*     */         int $i$a$-require-ProblemFix$Part$Change$1 = 0;
/*     */         String str = "Negative change start: " + this.range;
/*     */         throw new IllegalArgumentException(str.toString());
/*     */       } 
/*     */       this.kind = ProblemFix.Part.PartKind.CHANGE;
/*     */       this.display = this.text;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final TextRange getRange() {
/*     */       return this.range;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String getText() {
/*     */       return this.text;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public ProblemFix.Part.PartKind getKind() {
/*     */       return this.kind;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getDisplay() {
/*     */       return this.display;
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\f\n\002\030\002\n\002\020\020\n\002\b\005\b\001\030\0002\b\022\004\022\0020\0000\001B\007\b\002¢\006\002\020\002j\002\b\003j\002\b\004j\002\b\005¨\006\006"}, d2 = {"Lai/grazie/gec/model/problem/ProblemFix$Part$Change$ChangeType;", "", "(Ljava/lang/String;I)V", "INSERT", "REPLACE", "REMOVE", "model-gec"})
/*     */     public enum ChangeType {
/*     */       INSERT, REPLACE, REMOVE;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String apply(@NotNull String sentence) {
/*     */       Intrinsics.checkNotNullParameter(sentence, "sentence");
/*     */       return ExtensionsKt.replace(sentence, this.range, this.text);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final ChangeType getType() {
/*     */       if ((((CharSequence)this.text).length() == 0))
/*     */         return ChangeType.REMOVE; 
/*     */       if (this.range.isEmpty())
/*     */         return ChangeType.INSERT; 
/*     */       return ChangeType.REPLACE;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final TextRange component1() {
/*     */       return this.range;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String component2() {
/*     */       return this.text;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Change copy(@NotNull TextRange range, @NotNull String text) {
/*     */       Intrinsics.checkNotNullParameter(range, "range");
/*     */       Intrinsics.checkNotNullParameter(text, "text");
/*     */       return new Change(range, text);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "Change(range=" + this.range + ", text=" + this.text + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.range.hashCode();
/*     */       return result * 31 + this.text.hashCode();
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Change))
/*     */         return false; 
/*     */       Change change = (Change)other;
/*     */       return !Intrinsics.areEqual(this.range, change.range) ? false : (!!Intrinsics.areEqual(this.text, change.text));
/*     */     }
/*     */   }
/*     */   
/*     */   public boolean equals(@Nullable Object other) {
/*     */     if (this == other)
/*     */       return true; 
/*     */     if (other == null || getClass() != other.getClass())
/*     */       return false; 
/*     */     (ProblemFix)other;
/*     */     return (Arrays.equals((Object[])this.parts, (Object[])((ProblemFix)other).parts) && Intrinsics.areEqual(this.batchId, ((ProblemFix)other).batchId));
/*     */   }
/*     */   
/*     */   public int hashCode() {
/*     */     return 31 * ((this.batchId != null) ? this.batchId.hashCode() : 0) + Arrays.hashCode((Object[])this.parts);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Part[] component1() {
/*     */     return this.parts;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component2() {
/*     */     return this.batchId;
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public final String component3() {
/*     */     return this.customDisplayName;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final ProblemFix copy(@NotNull Part[] parts, @Nullable String batchId, @Nullable String customDisplayName) {
/*     */     Intrinsics.checkNotNullParameter(parts, "parts");
/*     */     return new ProblemFix(parts, batchId, customDisplayName);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String toString() {
/*     */     return "ProblemFix(parts=" + Arrays.toString((Object[])this.parts) + ", batchId=" + this.batchId + ", customDisplayName=" + this.customDisplayName + ")";
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\ProblemFix.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */