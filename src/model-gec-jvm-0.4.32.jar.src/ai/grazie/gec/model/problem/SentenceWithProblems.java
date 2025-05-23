/*    */ package ai.grazie.gec.model.problem;
/*    */ import ai.grazie.gec.model.SentenceWithCorrections;
/*    */ import ai.grazie.nlp.langs.Language;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
/* 10 */ @Serializable @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000L\n\002\030\002\n\002\020\000\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\021\n\002\030\002\n\000\n\002\030\002\n\002\b\021\n\002\020\013\n\002\b\004\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\004\b\b\030\000 +2\0020\001:\002*+B=\b\021\022\006\020\002\032\0020\003\022\b\020\004\032\004\030\0010\005\022\b\020\006\032\004\030\0010\007\022\016\020\b\032\n\022\004\022\0020\n\030\0010\t\022\b\020\013\032\004\030\0010\f¢\006\002\020\rB#\022\006\020\004\032\0020\005\022\006\020\006\032\0020\007\022\f\020\b\032\b\022\004\022\0020\n0\t¢\006\002\020\016J\022\020\026\032\004\030\0010\0052\006\020\027\032\0020\nH\002J\t\020\030\032\0020\005HÆ\003J\t\020\031\032\0020\007HÆ\003J\024\020\032\032\b\022\004\022\0020\n0\tHÆ\003¢\006\002\020\022J2\020\033\032\0020\0002\b\b\002\020\004\032\0020\0052\b\b\002\020\006\032\0020\0072\016\b\002\020\b\032\b\022\004\022\0020\n0\tHÆ\001¢\006\002\020\034J\023\020\035\032\0020\0362\b\020\037\032\004\030\0010\001H\002J\b\020 \032\0020\003H\026J\t\020!\032\0020\005HÖ\001J&\020\"\032\0020#2\006\020$\032\0020\0002\006\020%\032\0020&2\006\020'\032\0020(HÁ\001¢\006\002\b)R\021\020\006\032\0020\007¢\006\b\n\000\032\004\b\017\020\020R\031\020\b\032\b\022\004\022\0020\n0\t¢\006\n\n\002\020\023\032\004\b\021\020\022R\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\024\020\025¨\006,"}, d2 = {"Lai/grazie/gec/model/problem/SentenceWithProblems;", "", "seen1", "", "sentence", "", "language", "Lai/grazie/nlp/langs/Language;", "problems", "", "Lai/grazie/gec/model/problem/Problem;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lai/grazie/nlp/langs/Language;[Lai/grazie/gec/model/problem/Problem;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lai/grazie/nlp/langs/Language;[Lai/grazie/gec/model/problem/Problem;)V", "getLanguage", "()Lai/grazie/nlp/langs/Language;", "getProblems", "()[Lai/grazie/gec/model/problem/Problem;", "[Lai/grazie/gec/model/problem/Problem;", "getSentence", "()Ljava/lang/String;", "checkProblemWellFormed", "p", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lai/grazie/nlp/langs/Language;[Lai/grazie/gec/model/problem/Problem;)Lai/grazie/gec/model/problem/SentenceWithProblems;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$model_gec", "$serializer", "Companion", "model-gec"}) @SourceDebugExtension({"SMAP\nSentenceWithProblems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceWithProblems.kt\nai/grazie/gec/model/problem/SentenceWithProblems\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,66:1\n11476#2,9:67\n13402#2:76\n13403#2:78\n11485#2:79\n13402#2,2:80\n11485#2:82\n1#3:77\n*S KotlinDebug\n*F\n+ 1 SentenceWithProblems.kt\nai/grazie/gec/model/problem/SentenceWithProblems\n*L\n13#1:67,9\n13#1:76\n13#1:78\n13#1:79\n13#1:80,2\n13#1:82\n13#1:77\n*E\n"}) public final class SentenceWithProblems { @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN) @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\000\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÇ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\030\020\b\032\f\022\b\022\006\022\002\b\0030\n0\tHÖ\001¢\006\002\020\013J\021\020\f\032\0020\0022\006\020\r\032\0020\016HÖ\001J\031\020\017\032\0020\0202\006\020\021\032\0020\0222\006\020\023\032\0020\002HÖ\001R\024\020\004\032\0020\0058VXÖ\005¢\006\006\032\004\b\006\020\007¨\006\024"}, d2 = {"ai/grazie/gec/model/problem/SentenceWithProblems.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lai/grazie/gec/model/problem/SentenceWithProblems;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-gec"}) public static final class $serializer implements GeneratedSerializer<SentenceWithProblems> { @NotNull public static final $serializer INSTANCE = new $serializer(); @NotNull public KSerializer<?>[] typeParametersSerializers() { return (KSerializer<?>[])GeneratedSerializer.DefaultImpls.typeParametersSerializers(this); } @NotNull public SerialDescriptor getDescriptor() { return (SerialDescriptor)descriptor; } @NotNull public KSerializer<?>[] childSerializers() { KSerializer[] arrayOfKSerializer1 = (KSerializer[])SentenceWithProblems.$childSerializers, arrayOfKSerializer2 = new KSerializer[3]; arrayOfKSerializer2[0] = (KSerializer)StringSerializer.INSTANCE; arrayOfKSerializer2[1] = (KSerializer)Language.Serializer.INSTANCE; arrayOfKSerializer2[2] = arrayOfKSerializer1[2]; return (KSerializer<?>[])arrayOfKSerializer2; } @NotNull public SentenceWithProblems deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); SerialDescriptor serialDescriptor = getDescriptor(); boolean bool = true; int i = 0; String str = null; Language language = null; Problem[] arrayOfProblem = null; CompositeDecoder compositeDecoder = decoder.beginStructure(serialDescriptor); KSerializer[] arrayOfKSerializer = (KSerializer[])SentenceWithProblems.$childSerializers; if (compositeDecoder.decodeSequentially()) { str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x2; arrayOfProblem = (Problem[])compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], arrayOfProblem); i |= 0x4; } else { while (bool) { int j = compositeDecoder.decodeElementIndex(serialDescriptor); switch (j) { case -1: bool = false; continue;case 0: str = compositeDecoder.decodeStringElement(serialDescriptor, 0); i |= 0x1; continue;case 1: language = (Language)compositeDecoder.decodeSerializableElement(serialDescriptor, 1, (DeserializationStrategy)Language.Serializer.INSTANCE, language); i |= 0x2; continue;case 2: arrayOfProblem = (Problem[])compositeDecoder.decodeSerializableElement(serialDescriptor, 2, (DeserializationStrategy)arrayOfKSerializer[2], arrayOfProblem); i |= 0x4; continue; }  throw new UnknownFieldException(j); }  }  compositeDecoder.endStructure(serialDescriptor); return new SentenceWithProblems(i, str, language, arrayOfProblem, null); } public void serialize(@NotNull Encoder encoder, @NotNull SentenceWithProblems value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); SerialDescriptor serialDescriptor = getDescriptor(); CompositeEncoder compositeEncoder = encoder.beginStructure(serialDescriptor); SentenceWithProblems.write$Self$model_gec(value, compositeEncoder, serialDescriptor); compositeEncoder.endStructure(serialDescriptor); } static { PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ai.grazie.gec.model.problem.SentenceWithProblems", INSTANCE, 3); pluginGeneratedSerialDescriptor.addElement("sentence", false); pluginGeneratedSerialDescriptor.addElement("language", false); pluginGeneratedSerialDescriptor.addElement("problems", false); descriptor = pluginGeneratedSerialDescriptor; } } @NotNull public final String getSentence() { return this.sentence; } @NotNull public final Language getLanguage() { return this.language; } @NotNull public final Problem[] getProblems() { return this.problems; } private final String checkProblemWellFormed(Problem p) { ProblemFix[] arrayOfProblemFix; byte b; int i; for (arrayOfProblemFix = p.getFixes(), b = 0, i = arrayOfProblemFix.length; b < i; ) { ProblemFix fix = arrayOfProblemFix[b]; ProblemFix.Part.Change[] arrayOfChange; byte b1; int j; for (arrayOfChange = fix.getChanges(), b1 = 0, j = arrayOfChange.length; b1 < j; ) { ProblemFix.Part.Change c = arrayOfChange[b1]; if (c.getRange().getEndExclusive() > this.sentence.length()) return "Change range " + c.getRange() + " out of the sentence length " + this.sentence.length() + "; kind=" + p.getInfo().getId();  b1++; }  b++; }  return null; } @NotNull public static final Companion Companion = new Companion(null); public SentenceWithProblems(@NotNull String sentence, @NotNull Language language, @NotNull Problem[] problems) { this.sentence = sentence; this.language = language; this.problems = problems;
/*    */ 
/*    */     
/* 13 */     Problem[] arrayOfProblem1 = this.problems; int $i$f$mapNotNull = 0;
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
/* 67 */     Problem[] arrayOfProblem2 = arrayOfProblem1; Collection destination$iv$iv = new ArrayList(); int $i$f$mapNotNullTo = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 75 */     Problem[] arrayOfProblem3 = arrayOfProblem2; int $i$f$forEach = 0;
/* 76 */     byte b = 0; int i = arrayOfProblem3.length; if (b < i) { Object element$iv$iv$iv = arrayOfProblem3[b], element$iv$iv = element$iv$iv$iv; int $i$a$-forEach-ArraysKt___ArraysKt$mapNotNullTo$1$iv$iv = 0; Object object1 = element$iv$iv;
/*    */       int $i$a$-mapNotNull-SentenceWithProblems$errors$1 = 0; }
/*    */     
/* 79 */     List errors = (List)destination$iv$iv; if (!errors.isEmpty()) throw new IllegalArgumentException(CollectionsKt.joinToString$default(errors, (CharSequence)"; ", null, null, 0, null, null, 62, null));  } @NotNull private final String sentence; @NotNull private final Language language; @NotNull private final Problem[] problems; @JvmField @NotNull private static final KSerializer<Object>[] $childSerializers; static { KSerializer[] arrayOfKSerializer = new KSerializer[3]; arrayOfKSerializer[0] = null; arrayOfKSerializer[1] = null; arrayOfKSerializer[2] = (KSerializer)new ReferenceArraySerializer(Reflection.getOrCreateKotlinClass(Problem.class), (KSerializer)Problem.$serializer.INSTANCE); $childSerializers = (KSerializer<Object>[])arrayOfKSerializer; } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020 \n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\021\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\"\020\003\032\b\022\004\022\0020\0050\0042\f\020\006\032\b\022\004\022\0020\0070\0042\006\020\b\032\0020\tJ)\020\n\032\b\022\004\022\0020\0050\0132\f\020\006\032\b\022\004\022\0020\0070\0132\006\020\b\032\0020\tH\007¢\006\002\020\fJ\026\020\r\032\0020\0052\006\020\b\032\0020\t2\006\020\016\032\0020\017J\017\020\020\032\b\022\004\022\0020\0050\021HÆ\001¨\006\022"}, d2 = {"Lai/grazie/gec/model/problem/SentenceWithProblems$Companion;", "", "()V", "allEmpty", "", "Lai/grazie/gec/model/problem/SentenceWithProblems;", "sentences", "", "language", "Lai/grazie/nlp/langs/Language;", "empty", "", "([Ljava/lang/String;Lai/grazie/nlp/langs/Language;)[Lai/grazie/gec/model/problem/SentenceWithProblems;", "of", "corrections", "Lai/grazie/gec/model/SentenceWithCorrections;", "serializer", "Lkotlinx/serialization/KSerializer;", "model-gec"}) @SourceDebugExtension({"SMAP\nSentenceWithProblems.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SentenceWithProblems.kt\nai/grazie/gec/model/problem/SentenceWithProblems$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,66:1\n11158#2:67\n11493#2,3:68\n11158#2:79\n11493#2,3:80\n37#3:71\n36#3,3:72\n37#3:83\n36#3,3:84\n1557#4:75\n1628#4,3:76\n*S KotlinDebug\n*F\n+ 1 SentenceWithProblems.kt\nai/grazie/gec/model/problem/SentenceWithProblems$Companion\n*L\n33#1:67\n33#1:68,3\n41#1:79\n41#1:80,3\n33#1:71\n33#1:72,3\n44#1:83\n44#1:84,3\n37#1:75\n37#1:76,3\n*E\n"}) public static final class Companion { @NotNull public final SentenceWithProblems of(@NotNull Language language, @NotNull SentenceWithCorrections corrections) { Intrinsics.checkNotNullParameter(language, "language"); Intrinsics.checkNotNullParameter(corrections, "corrections"); SentenceWithCorrections.Correction[] arrayOfCorrection1 = corrections.getCorrections(); int $i$f$map = 0; SentenceWithCorrections.Correction[] arrayOfCorrection2 = arrayOfCorrection1; Collection<Problem> destination$iv$iv = new ArrayList(arrayOfCorrection1.length); int $i$f$mapTo = 0; byte b; int i;
/* 80 */       for (b = 0, i = arrayOfCorrection2.length; b < i; ) { Object item$iv$iv = arrayOfCorrection2[b];
/* 81 */         Object object1 = item$iv$iv; Collection<Problem> collection = destination$iv$iv; int $i$a$-map-SentenceWithProblems$Companion$of$problems$1 = 0; collection.add(Problem.Companion.of((SentenceWithCorrections.Correction)object1)); }
/* 82 */        List problems = (List)destination$iv$iv; Collection $this$toTypedArray$iv = problems;
/*    */       int $i$f$toTypedArray = 0;
/* 84 */       Collection thisCollection$iv = $this$toTypedArray$iv;
/*    */       
/* 86 */       return new SentenceWithProblems(corrections.getText(), language, (Problem[])thisCollection$iv.toArray((Object[])new Problem[0])); }
/*    */ 
/*    */     
/*    */     private Companion() {}
/*    */     
/*    */     @NotNull
/*    */     public final KSerializer<SentenceWithProblems> serializer() {
/*    */       return (KSerializer<SentenceWithProblems>)SentenceWithProblems.$serializer.INSTANCE;
/*    */     }
/*    */     
/*    */     @Deprecated(message = "Use allEmpty", replaceWith = @ReplaceWith(expression = "allEmpty", imports = {}))
/*    */     @NotNull
/*    */     public final SentenceWithProblems[] empty(@NotNull String[] sentences, @NotNull Language language) {
/*    */       Intrinsics.checkNotNullParameter(sentences, "sentences");
/*    */       Intrinsics.checkNotNullParameter(language, "language");
/*    */       String[] arrayOfString1 = sentences;
/*    */       int $i$f$map = 0;
/*    */       String[] arrayOfString2 = arrayOfString1;
/*    */       Collection<SentenceWithProblems> destination$iv$iv = new ArrayList(arrayOfString1.length);
/*    */       int $i$f$mapTo = 0;
/*    */       byte b;
/*    */       int i;
/*    */       for (b = 0, i = arrayOfString2.length; b < i; ) {
/*    */         Object item$iv$iv = arrayOfString2[b];
/*    */         Object object1 = item$iv$iv;
/*    */         Collection<SentenceWithProblems> collection = destination$iv$iv;
/*    */         int $i$a$-map-SentenceWithProblems$Companion$empty$1 = 0;
/*    */         collection.add(new SentenceWithProblems((String)object1, language, new Problem[0]));
/*    */       } 
/*    */       List list = (List)destination$iv$iv;
/*    */       int $i$f$toTypedArray = 0;
/*    */       Collection thisCollection$iv = list;
/*    */       return (SentenceWithProblems[])thisCollection$iv.toArray((Object[])new SentenceWithProblems[0]);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final List<SentenceWithProblems> allEmpty(@NotNull List sentences, @NotNull Language language) {
/*    */       Intrinsics.checkNotNullParameter(sentences, "sentences");
/*    */       Intrinsics.checkNotNullParameter(language, "language");
/*    */       Iterable $this$map$iv = sentences;
/*    */       int $i$f$map = 0;
/*    */       Iterable iterable1 = $this$map$iv;
/*    */       Collection<SentenceWithProblems> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
/*    */       int $i$f$mapTo = 0;
/*    */       for (Object item$iv$iv : iterable1) {
/*    */         String str = (String)item$iv$iv;
/*    */         Collection<SentenceWithProblems> collection = destination$iv$iv;
/*    */         int $i$a$-map-SentenceWithProblems$Companion$allEmpty$1 = 0;
/*    */         collection.add(new SentenceWithProblems(str, language, new Problem[0]));
/*    */       } 
/*    */       return (List<SentenceWithProblems>)destination$iv$iv;
/*    */     } }
/*    */ 
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (other == null || getClass() != other.getClass())
/*    */       return false; 
/*    */     (SentenceWithProblems)other;
/*    */     if (!Intrinsics.areEqual(this.sentence, ((SentenceWithProblems)other).sentence))
/*    */       return false; 
/*    */     if (this.language != ((SentenceWithProblems)other).language)
/*    */       return false; 
/*    */     return Arrays.equals((Object[])this.problems, (Object[])((SentenceWithProblems)other).problems);
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     int result = this.sentence.hashCode();
/*    */     result = 31 * result + this.language.hashCode();
/*    */     result = 31 * result + Arrays.hashCode((Object[])this.problems);
/*    */     return result;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.sentence;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Language component2() {
/*    */     return this.language;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final Problem[] component3() {
/*    */     return this.problems;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final SentenceWithProblems copy(@NotNull String sentence, @NotNull Language language, @NotNull Problem[] problems) {
/*    */     Intrinsics.checkNotNullParameter(sentence, "sentence");
/*    */     Intrinsics.checkNotNullParameter(language, "language");
/*    */     Intrinsics.checkNotNullParameter(problems, "problems");
/*    */     return new SentenceWithProblems(sentence, language, problems);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "SentenceWithProblems(sentence=" + this.sentence + ", language=" + this.language + ", problems=" + Arrays.toString((Object[])this.problems) + ")";
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-gec-jvm-0.4.32.jar!\ai\grazie\gec\model\problem\SentenceWithProblems.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */