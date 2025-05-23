/*    */ package ai.grazie.nlp.tokenizer.sentence;
/*    */ 
/*    */ import ai.grazie.nlp.tokenizer.Tokenizer;
/*    */ import ai.grazie.nlp.utils.SplitKt;
/*    */ import ai.grazie.text.Text;
/*    */ import ai.grazie.text.TextRange;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import kotlin.Deprecated;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.Pair;
/*    */ import kotlin.ReplaceWith;
/*    */ import kotlin.collections.CollectionsKt;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlin.text.Regex;
/*    */ import kotlin.text.StringsKt;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated(message = "RuleSentenceTokenizer is deprecated, consider migrating to StandardSentenceTokenizer", replaceWith = @ReplaceWith(expression = "StandardSentenceTokenizer", imports = {"ai.grazie.nlp.tokenizer.StandardSentenceTokenizer"}))
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\006\n\002\020 \n\002\030\002\n\002\b\002\b\007\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\020\020\013\032\0020\0032\006\020\f\032\0020\003H\002J\020\020\r\032\0020\0032\006\020\f\032\0020\003H\002J\026\020\016\032\b\022\004\022\0020\0200\0172\006\020\f\032\0020\003H\026J\020\020\021\032\b\022\004\022\0020\0030\017*\0020\003R\036\020\005\032\022\022\004\022\0020\0070\006j\b\022\004\022\0020\007`\bX\004¢\006\002\n\000R\016\020\t\032\0020\007X\004¢\006\002\n\000R\036\020\n\032\022\022\004\022\0020\0070\006j\b\022\004\022\0020\007`\bX\004¢\006\002\n\000¨\006\022"}, d2 = {"Lai/grazie/nlp/tokenizer/sentence/RuleSentenceTokenizer;", "Lai/grazie/nlp/tokenizer/Tokenizer;", "srxData", "", "(Ljava/lang/String;)V", "exceptions", "Ljava/util/ArrayList;", "Lkotlin/text/Regex;", "Lkotlin/collections/ArrayList;", "pattern", "rules", "clean", "text", "decode", "tokenize", "", "Lai/grazie/nlp/tokenizer/Tokenizer$Token;", "sentences", "nlp-tokenizer"})
/*    */ @SourceDebugExtension({"SMAP\nRuleSentenceTokenizer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuleSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/RuleSentenceTokenizer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1#2:66\n1557#3:67\n1628#3,3:68\n1557#3:71\n1628#3,3:72\n*S KotlinDebug\n*F\n+ 1 RuleSentenceTokenizer.kt\nai/grazie/nlp/tokenizer/sentence/RuleSentenceTokenizer\n*L\n60#1:67\n60#1:68,3\n63#1:71\n63#1:72,3\n*E\n"})
/*    */ public final class RuleSentenceTokenizer
/*    */   implements Tokenizer
/*    */ {
/*    */   @NotNull
/*    */   private final Regex pattern;
/*    */   @NotNull
/*    */   private final ArrayList<Regex> rules;
/*    */   @NotNull
/*    */   private final ArrayList<Regex> exceptions;
/*    */   
/*    */   public RuleSentenceTokenizer(@NotNull String srxData) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'srxData'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_0
/*    */     //   7: invokespecial <init> : ()V
/*    */     //   10: aload_0
/*    */     //   11: new kotlin/text/Regex
/*    */     //   14: dup
/*    */     //   15: ldc '<rule(?:(\s+break="no")|\s+[^>]+|\s*)>(?:<beforebreak>([^<]*)</beforebreak>)?(?:<afterbreak>([^<]*)</afterbreak>)?</rule>'
/*    */     //   17: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   20: putfield pattern : Lkotlin/text/Regex;
/*    */     //   23: aload_0
/*    */     //   24: new java/util/ArrayList
/*    */     //   27: dup
/*    */     //   28: invokespecial <init> : ()V
/*    */     //   31: putfield rules : Ljava/util/ArrayList;
/*    */     //   34: aload_0
/*    */     //   35: new java/util/ArrayList
/*    */     //   38: dup
/*    */     //   39: invokespecial <init> : ()V
/*    */     //   42: putfield exceptions : Ljava/util/ArrayList;
/*    */     //   45: nop
/*    */     //   46: aload_0
/*    */     //   47: aload_1
/*    */     //   48: invokespecial clean : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   51: astore_2
/*    */     //   52: aload_0
/*    */     //   53: getfield pattern : Lkotlin/text/Regex;
/*    */     //   56: aload_2
/*    */     //   57: checkcast java/lang/CharSequence
/*    */     //   60: iconst_0
/*    */     //   61: iconst_2
/*    */     //   62: aconst_null
/*    */     //   63: invokestatic findAll$default : (Lkotlin/text/Regex;Ljava/lang/CharSequence;IILjava/lang/Object;)Lkotlin/sequences/Sequence;
/*    */     //   66: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   71: astore_3
/*    */     //   72: aload_3
/*    */     //   73: invokeinterface hasNext : ()Z
/*    */     //   78: ifeq -> 351
/*    */     //   81: aload_3
/*    */     //   82: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   87: checkcast kotlin/text/MatchResult
/*    */     //   90: astore #4
/*    */     //   92: aload #4
/*    */     //   94: invokeinterface getGroupValues : ()Ljava/util/List;
/*    */     //   99: iconst_1
/*    */     //   100: invokestatic getOrNull : (Ljava/util/List;I)Ljava/lang/Object;
/*    */     //   103: checkcast java/lang/String
/*    */     //   106: dup
/*    */     //   107: ifnull -> 127
/*    */     //   110: checkcast java/lang/CharSequence
/*    */     //   113: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*    */     //   116: ifne -> 123
/*    */     //   119: iconst_1
/*    */     //   120: goto -> 124
/*    */     //   123: iconst_0
/*    */     //   124: goto -> 129
/*    */     //   127: pop
/*    */     //   128: iconst_0
/*    */     //   129: istore #5
/*    */     //   131: aload #4
/*    */     //   133: invokeinterface getGroupValues : ()Ljava/util/List;
/*    */     //   138: iconst_2
/*    */     //   139: invokestatic getOrNull : (Ljava/util/List;I)Ljava/lang/Object;
/*    */     //   142: checkcast java/lang/String
/*    */     //   145: dup
/*    */     //   146: ifnull -> 187
/*    */     //   149: astore #8
/*    */     //   151: aload #8
/*    */     //   153: astore #9
/*    */     //   155: iconst_0
/*    */     //   156: istore #10
/*    */     //   158: aload #9
/*    */     //   160: checkcast java/lang/CharSequence
/*    */     //   163: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*    */     //   166: ifne -> 173
/*    */     //   169: iconst_1
/*    */     //   170: goto -> 174
/*    */     //   173: iconst_0
/*    */     //   174: nop
/*    */     //   175: ifeq -> 183
/*    */     //   178: aload #8
/*    */     //   180: goto -> 189
/*    */     //   183: aconst_null
/*    */     //   184: goto -> 189
/*    */     //   187: pop
/*    */     //   188: aconst_null
/*    */     //   189: astore #6
/*    */     //   191: aload #4
/*    */     //   193: invokeinterface getGroupValues : ()Ljava/util/List;
/*    */     //   198: iconst_3
/*    */     //   199: invokestatic getOrNull : (Ljava/util/List;I)Ljava/lang/Object;
/*    */     //   202: checkcast java/lang/String
/*    */     //   205: dup
/*    */     //   206: ifnull -> 247
/*    */     //   209: astore #9
/*    */     //   211: aload #9
/*    */     //   213: astore #10
/*    */     //   215: iconst_0
/*    */     //   216: istore #11
/*    */     //   218: aload #10
/*    */     //   220: checkcast java/lang/CharSequence
/*    */     //   223: invokestatic isBlank : (Ljava/lang/CharSequence;)Z
/*    */     //   226: ifne -> 233
/*    */     //   229: iconst_1
/*    */     //   230: goto -> 234
/*    */     //   233: iconst_0
/*    */     //   234: nop
/*    */     //   235: ifeq -> 243
/*    */     //   238: aload #9
/*    */     //   240: goto -> 249
/*    */     //   243: aconst_null
/*    */     //   244: goto -> 249
/*    */     //   247: pop
/*    */     //   248: aconst_null
/*    */     //   249: astore #7
/*    */     //   251: aload_0
/*    */     //   252: aload #6
/*    */     //   254: dup
/*    */     //   255: ifnonnull -> 261
/*    */     //   258: pop
/*    */     //   259: ldc ''
/*    */     //   261: invokespecial decode : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   264: aload #7
/*    */     //   266: dup
/*    */     //   267: ifnull -> 296
/*    */     //   270: astore #11
/*    */     //   272: astore #13
/*    */     //   274: iconst_0
/*    */     //   275: istore #12
/*    */     //   277: aload_0
/*    */     //   278: aload #11
/*    */     //   280: invokespecial decode : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   283: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   288: aload #13
/*    */     //   290: swap
/*    */     //   291: nop
/*    */     //   292: dup
/*    */     //   293: ifnonnull -> 299
/*    */     //   296: pop
/*    */     //   297: ldc ''
/*    */     //   299: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   304: astore #8
/*    */     //   306: iload #5
/*    */     //   308: ifeq -> 331
/*    */     //   311: aload_0
/*    */     //   312: getfield exceptions : Ljava/util/ArrayList;
/*    */     //   315: new kotlin/text/Regex
/*    */     //   318: dup
/*    */     //   319: aload #8
/*    */     //   321: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   324: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   327: pop
/*    */     //   328: goto -> 72
/*    */     //   331: aload_0
/*    */     //   332: getfield rules : Ljava/util/ArrayList;
/*    */     //   335: new kotlin/text/Regex
/*    */     //   338: dup
/*    */     //   339: aload #8
/*    */     //   341: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   344: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   347: pop
/*    */     //   348: goto -> 72
/*    */     //   351: nop
/*    */     //   352: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #13	-> 6
/*    */     //   #18	-> 10
/*    */     //   #19	-> 15
/*    */     //   #18	-> 17
/*    */     //   #21	-> 23
/*    */     //   #22	-> 34
/*    */     //   #24	-> 45
/*    */     //   #25	-> 46
/*    */     //   #26	-> 52
/*    */     //   #27	-> 92
/*    */     //   #27	-> 124
/*    */     //   #28	-> 131
/*    */     //   #66	-> 155
/*    */     //   #28	-> 158
/*    */     //   #28	-> 174
/*    */     //   #28	-> 175
/*    */     //   #28	-> 187
/*    */     //   #29	-> 191
/*    */     //   #66	-> 215
/*    */     //   #29	-> 218
/*    */     //   #29	-> 234
/*    */     //   #29	-> 235
/*    */     //   #29	-> 247
/*    */     //   #31	-> 251
/*    */     //   #66	-> 272
/*    */     //   #31	-> 277
/*    */     //   #31	-> 291
/*    */     //   #31	-> 292
/*    */     //   #32	-> 306
/*    */     //   #33	-> 311
/*    */     //   #35	-> 331
/*    */     //   #38	-> 351
/*    */     //   #17	-> 352
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   158	17	10	$i$a$-takeIf-RuleSentenceTokenizer$before$1	I
/*    */     //   155	20	9	it	Ljava/lang/String;
/*    */     //   218	17	11	$i$a$-takeIf-RuleSentenceTokenizer$after$1	I
/*    */     //   215	20	10	it	Ljava/lang/String;
/*    */     //   277	11	12	$i$a$-let-RuleSentenceTokenizer$regex$1	I
/*    */     //   274	14	11	it	Ljava/lang/String;
/*    */     //   131	217	5	noBreak	Z
/*    */     //   191	157	6	before	Ljava/lang/String;
/*    */     //   251	97	7	after	Ljava/lang/String;
/*    */     //   306	42	8	regex	Ljava/lang/String;
/*    */     //   92	256	4	match	Lkotlin/text/MatchResult;
/*    */     //   52	299	2	cleaned	Ljava/lang/String;
/*    */     //   0	353	0	this	Lai/grazie/nlp/tokenizer/sentence/RuleSentenceTokenizer;
/*    */     //   0	353	1	srxData	Ljava/lang/String;
/*    */   }
/*    */   
/*    */   private final String clean(String text) {
/* 41 */     CharSequence charSequence = text; Regex regex = new Regex("<!--[\\s\\S]*?-->"); String str = ""; charSequence = regex.replace(charSequence, str); regex = new Regex(">\\s+<"); str = "><"; return regex.replace(charSequence, str);
/*    */   }
/*    */   
/*    */   private final String decode(String text) {
/* 45 */     return StringsKt.replace$default(StringsKt.replace$default(text, "&lt;", "<", false, 4, null), "&rt;", ">", false, 4, null);
/*    */   }
/*    */   
/*    */   @NotNull
/* 49 */   public List<Tokenizer.Token> tokenize(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); if ((((CharSequence)text).length() == 0)) return CollectionsKt.emptyList();
/*    */     
/* 51 */     String result = text;
/* 52 */     for (Regex rule : this.exceptions) {
/* 53 */       CharSequence charSequence = result; Intrinsics.checkNotNullExpressionValue(rule, "rule"); Regex regex1 = rule; String str = "$0"; result = regex1.replace(charSequence, str);
/*    */     } 
/* 55 */     for (Regex rule : this.rules) {
/* 56 */       CharSequence charSequence = result; Intrinsics.checkNotNullExpressionValue(rule, "rule"); Regex regex1 = rule; String str = "$0"; result = regex1.replace(charSequence, str);
/*    */     } 
/*    */     
/* 59 */     char[] arrayOfChar = new char[1]; arrayOfChar[0] = ''; List split = SplitKt.splitWithRanges(StringsKt.replace$default(result, "", "", false, 4, null), arrayOfChar, false);
/* 60 */     Iterable $this$map$iv = split; int $i$f$map = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 67 */     Iterable iterable1 = $this$map$iv; Collection<Tokenizer.Token> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 68 */     for (Object item$iv$iv : iterable1) {
/* 69 */       Pair pair = (Pair)item$iv$iv; Collection<Tokenizer.Token> collection = destination$iv$iv; int $i$a$-map-RuleSentenceTokenizer$tokenize$1 = 0; collection.add(new Tokenizer.Token(new Text((String)pair.getSecond()), (TextRange)pair.getFirst()));
/* 70 */     }  return (List<Tokenizer.Token>)destination$iv$iv; } @NotNull public final List<String> sentences(@NotNull String $this$sentences) { Intrinsics.checkNotNullParameter($this$sentences, "<this>"); Iterable<Tokenizer.Token> $this$map$iv = tokenize($this$sentences); int $i$f$map = 0;
/* 71 */     Iterable<Tokenizer.Token> iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 72 */     for (Tokenizer.Token item$iv$iv : iterable1) {
/* 73 */       Tokenizer.Token token1 = item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-RuleSentenceTokenizer$sentences$1 = 0; collection.add(token1.getToken());
/* 74 */     }  return (List<String>)destination$iv$iv; }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-tokenizer-jvm-0.4.32.jar!\ai\grazie\nlp\tokenizer\sentence\RuleSentenceTokenizer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */