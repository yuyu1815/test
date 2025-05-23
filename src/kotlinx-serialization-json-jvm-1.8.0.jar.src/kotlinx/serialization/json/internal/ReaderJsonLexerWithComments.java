/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\031\n\002\b\003\n\002\020\002\n\000\n\002\020\f\n\000\n\002\020\013\n\002\020\005\n\002\b\002\n\002\030\002\n\002\020\b\n\002\b\004\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\b\032\0020\t2\006\020\n\032\0020\013H\026J\b\020\f\032\0020\rH\026J\b\020\b\032\0020\016H\026J\b\020\017\032\0020\016H\026J\034\020\020\032\016\022\004\022\0020\022\022\004\022\0020\r0\0212\006\020\023\032\0020\022H\002J\020\020\024\032\0020\0222\006\020\023\032\0020\022H\002J\b\020\025\032\0020\022H\026¨\006\026"}, d2 = {"Lkotlinx/serialization/json/internal/ReaderJsonLexerWithComments;", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "reader", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "buffer", "", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonReader;[C)V", "consumeNextToken", "", "expected", "", "canConsumeValue", "", "", "peekNextToken", "handleComment", "Lkotlin/Pair;", "", "position", "prefetchWithinThreshold", "skipWhitespaces", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nCommentLexers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/ReaderJsonLexerWithComments\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,219:1\n158#2:220\n*S KotlinDebug\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/ReaderJsonLexerWithComments\n*L\n204#1:220\n*E\n"})
/*     */ public final class ReaderJsonLexerWithComments
/*     */   extends ReaderJsonLexer
/*     */ {
/*     */   public ReaderJsonLexerWithComments(@NotNull InternalJsonReader reader, @NotNull char[] buffer) {
/*  96 */     super(reader, buffer);
/*     */   } public void consumeNextToken(char expected) {
/*  98 */     ensureHaveChars();
/*  99 */     ArrayAsSequence source = getSource();
/* 100 */     int current = skipWhitespaces();
/*     */     
/* 102 */     if (current >= source.length() || current == -1) {
/* 103 */       this.currentPosition = -1;
/* 104 */       unexpectedToken(expected);
/*     */     } 
/* 106 */     char c = source.charAt(current);
/* 107 */     this.currentPosition = current + 1;
/* 108 */     if (c == expected)
/* 109 */       return;  unexpectedToken(expected);
/*     */   }
/*     */   
/*     */   public boolean canConsumeValue() {
/* 113 */     ensureHaveChars();
/* 114 */     int current = skipWhitespaces();
/*     */     
/* 116 */     if (current >= getSource().length() || current == -1) return false; 
/* 117 */     return isValidValueStart(getSource().charAt(current));
/*     */   }
/*     */   
/*     */   public byte consumeNextToken() {
/* 121 */     ensureHaveChars();
/* 122 */     ArrayAsSequence source = getSource();
/* 123 */     int cpos = skipWhitespaces();
/* 124 */     if (cpos >= source.length() || cpos == -1) return 10; 
/* 125 */     this.currentPosition = cpos + 1;
/* 126 */     return AbstractJsonLexerKt.charToTokenClass(source.charAt(cpos));
/*     */   }
/*     */   
/*     */   public byte peekNextToken() {
/* 130 */     ensureHaveChars();
/* 131 */     ArrayAsSequence source = getSource();
/* 132 */     int cpos = skipWhitespaces();
/*     */     
/* 134 */     if (cpos >= source.length() || cpos == -1) return 10; 
/* 135 */     this.currentPosition = cpos;
/* 136 */     return AbstractJsonLexerKt.charToTokenClass(source.charAt(cpos));
/*     */   }
/*     */   private final Pair<Integer, Boolean> handleComment(int position) {
/*     */     boolean rareCaseHit;
/* 140 */     int current = position;
/* 141 */     int startIndex = current + 2;
/* 142 */     switch (getSource().charAt(current + 1)) {
/*     */       case '/':
/* 144 */         while (current != -1) {
/* 145 */           current = StringsKt.indexOf$default(getSource(), '\n', startIndex, false, 4, null);
/* 146 */           if (current == -1) {
/* 147 */             current = prefetchOrEof(getSource().length());
/* 148 */             startIndex = current; continue;
/*     */           } 
/* 150 */           return TuplesKt.to(Integer.valueOf(current + 1), Boolean.valueOf(true));
/*     */         } 
/*     */ 
/*     */         
/* 154 */         return TuplesKt.to(Integer.valueOf(-1), Boolean.valueOf(true));
/*     */ 
/*     */       
/*     */       case '*':
/* 158 */         rareCaseHit = false;
/* 159 */         while (current != -1) {
/* 160 */           current = StringsKt.indexOf$default(getSource(), "*/", startIndex, false, 4, null);
/* 161 */           if (current != -1)
/* 162 */             return TuplesKt.to(Integer.valueOf(current + 2), Boolean.valueOf(true)); 
/* 163 */           if (getSource().charAt(getSource().length() - 1) != '*') {
/* 164 */             current = prefetchOrEof(getSource().length());
/* 165 */             startIndex = current;
/*     */             
/*     */             continue;
/*     */           } 
/* 169 */           current = prefetchWithinThreshold(getSource().length() - 1);
/*     */ 
/*     */ 
/*     */           
/* 173 */           if (rareCaseHit) {
/*     */             break;
/*     */           }
/* 176 */           rareCaseHit = true;
/* 177 */           startIndex = current;
/*     */         } 
/*     */ 
/*     */         
/* 181 */         this.currentPosition = getSource().length();
/* 182 */         AbstractJsonLexer.fail$default(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null); throw new KotlinNothingValueException();
/*     */     } 
/*     */     
/* 185 */     return TuplesKt.to(Integer.valueOf(current), Boolean.valueOf(false));
/*     */   }
/*     */   
/*     */   private final int prefetchWithinThreshold(int position) {
/* 189 */     if (getSource().length() - position > this.threshold) return position; 
/* 190 */     this.currentPosition = position;
/* 191 */     ensureHaveChars();
/* 192 */     if (this.currentPosition != 0 || ((getSource().length() == 0))) return -1; 
/* 193 */     return 0;
/*     */   }
/*     */   
/*     */   public int skipWhitespaces() {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: getfield currentPosition : I
/*     */     //   4: istore_1
/*     */     //   5: nop
/*     */     //   6: aload_0
/*     */     //   7: iload_1
/*     */     //   8: invokevirtual prefetchOrEof : (I)I
/*     */     //   11: istore_1
/*     */     //   12: iload_1
/*     */     //   13: iconst_m1
/*     */     //   14: if_icmpeq -> 137
/*     */     //   17: aload_0
/*     */     //   18: invokevirtual getSource : ()Lkotlinx/serialization/json/internal/ArrayAsSequence;
/*     */     //   21: iload_1
/*     */     //   22: invokevirtual charAt : (I)C
/*     */     //   25: istore_2
/*     */     //   26: aload_0
/*     */     //   27: checkcast kotlinx/serialization/json/internal/AbstractJsonLexer
/*     */     //   30: astore_3
/*     */     //   31: iload_2
/*     */     //   32: istore #4
/*     */     //   34: iconst_0
/*     */     //   35: istore #5
/*     */     //   37: iload #4
/*     */     //   39: bipush #32
/*     */     //   41: if_icmpeq -> 65
/*     */     //   44: iload #4
/*     */     //   46: bipush #10
/*     */     //   48: if_icmpeq -> 65
/*     */     //   51: iload #4
/*     */     //   53: bipush #13
/*     */     //   55: if_icmpeq -> 65
/*     */     //   58: iload #4
/*     */     //   60: bipush #9
/*     */     //   62: if_icmpne -> 69
/*     */     //   65: iconst_1
/*     */     //   66: goto -> 70
/*     */     //   69: iconst_0
/*     */     //   70: ifeq -> 79
/*     */     //   73: iinc #1, 1
/*     */     //   76: goto -> 5
/*     */     //   79: iload_2
/*     */     //   80: bipush #47
/*     */     //   82: if_icmpne -> 136
/*     */     //   85: iload_1
/*     */     //   86: iconst_1
/*     */     //   87: iadd
/*     */     //   88: aload_0
/*     */     //   89: invokevirtual getSource : ()Lkotlinx/serialization/json/internal/ArrayAsSequence;
/*     */     //   92: invokevirtual length : ()I
/*     */     //   95: if_icmpge -> 136
/*     */     //   98: aload_0
/*     */     //   99: iload_1
/*     */     //   100: invokespecial handleComment : (I)Lkotlin/Pair;
/*     */     //   103: astore_3
/*     */     //   104: aload_3
/*     */     //   105: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   108: checkcast java/lang/Number
/*     */     //   111: invokevirtual intValue : ()I
/*     */     //   114: istore #4
/*     */     //   116: aload_3
/*     */     //   117: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   120: checkcast java/lang/Boolean
/*     */     //   123: invokevirtual booleanValue : ()Z
/*     */     //   126: istore #5
/*     */     //   128: iload #4
/*     */     //   130: istore_1
/*     */     //   131: iload #5
/*     */     //   133: ifne -> 5
/*     */     //   136: nop
/*     */     //   137: aload_0
/*     */     //   138: iload_1
/*     */     //   139: putfield currentPosition : I
/*     */     //   142: iload_1
/*     */     //   143: ireturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #197	-> 0
/*     */     //   #199	-> 5
/*     */     //   #200	-> 6
/*     */     //   #201	-> 12
/*     */     //   #202	-> 17
/*     */     //   #204	-> 26
/*     */     //   #220	-> 37
/*     */     //   #204	-> 70
/*     */     //   #205	-> 73
/*     */     //   #206	-> 76
/*     */     //   #208	-> 79
/*     */     //   #209	-> 98
/*     */     //   #210	-> 128
/*     */     //   #211	-> 131
/*     */     //   #213	-> 136
/*     */     //   #215	-> 137
/*     */     //   #216	-> 142
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   37	33	5	$i$f$isWs	I
/*     */     //   34	36	3	this_$iv	Lkotlinx/serialization/json/internal/AbstractJsonLexer;
/*     */     //   34	36	4	$this$isWs$iv	C
/*     */     //   116	20	4	new	I
/*     */     //   128	8	5	cont	Z
/*     */     //   26	111	2	c	C
/*     */     //   5	139	1	current	I
/*     */     //   0	144	0	this	Lkotlinx/serialization/json/internal/ReaderJsonLexerWithComments;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\ReaderJsonLexerWithComments.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */