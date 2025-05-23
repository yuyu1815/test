/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.text.StringsKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\n\002\020\b\n\002\b\002\n\002\020\005\n\000\n\002\020\013\n\000\n\002\020\002\n\000\n\002\020\f\n\002\b\004\n\002\030\002\n\002\030\002\n\002\b\005\b\020\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\020\020\b\032\0020\t2\006\020\n\032\0020\tH\026J\b\020\013\032\0020\fH\026J\b\020\r\032\0020\016H\026J\b\020\017\032\0020\tH\026J\020\020\013\032\0020\0202\006\020\021\032\0020\022H\026J\b\020\023\032\0020\003H\026J3\020\024\032\0020\0202\006\020\025\032\0020\0162!\020\026\032\035\022\023\022\0210\003¢\006\f\b\030\022\b\b\031\022\004\b\b(\032\022\004\022\0020\0200\027H\026J\032\020\033\032\004\030\0010\0032\006\020\034\032\0020\0032\006\020\025\032\0020\016H\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\035"}, d2 = {"Lkotlinx/serialization/json/internal/StringJsonLexer;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "prefetchOrEof", "", "position", "consumeNextToken", "", "canConsumeValue", "", "skipWhitespaces", "", "expected", "", "consumeKeyString", "consumeStringChunked", "isLenient", "consumeChunk", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "stringChunk", "peekLeadingMatchingValue", "keyToMatch", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nStringJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,129:1\n158#2:130\n158#2:131\n158#2:132\n158#2:133\n226#2,10:134\n229#3:144\n1863#4,2:145\n*S KotlinDebug\n*F\n+ 1 StringJsonLexer.kt\nkotlinx/serialization/json/internal/StringJsonLexer\n*L\n23#1:130\n38#1:131\n57#1:132\n73#1:133\n95#1:134,10\n95#1:144\n109#1:145,2\n*E\n"})
/*     */ public class StringJsonLexer extends AbstractJsonLexer {
/*     */   @NotNull
/*     */   private final String source;
/*     */   
/*  14 */   public StringJsonLexer(@NotNull String source) { this.source = source; } @NotNull protected String getSource() { return this.source; }
/*     */    public int prefetchOrEof(int position) {
/*  16 */     return (position < getSource().length()) ? position : -1;
/*     */   }
/*     */   
/*  19 */   public byte consumeNextToken() { String source = getSource();
/*  20 */     int cpos = this.currentPosition;
/*  21 */     while (cpos != -1 && cpos < source.length())
/*  22 */     { char c = source.charAt(cpos++);
/*  23 */       StringJsonLexer stringJsonLexer = this; char $this$isWs$iv = c; int $i$f$isWs = 0; if (!(
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 130 */         ($this$isWs$iv == ' ' || $this$isWs$iv == '\n' || $this$isWs$iv == '\r' || $this$isWs$iv == '\t') ? 1 : 0)) { this.currentPosition = cpos; return AbstractJsonLexerKt.charToTokenClass(c); }  }  this.currentPosition = source.length(); return 10; } public boolean canConsumeValue() { int current = this.currentPosition; if (current == -1)
/* 131 */       return false;  String source = getSource(); while (current < source.length()) { char c = source.charAt(current); StringJsonLexer stringJsonLexer = this; char $this$isWs$iv = c; int $i$f$isWs = 0; if (($this$isWs$iv == ' ' || $this$isWs$iv == '\n' || $this$isWs$iv == '\r' || $this$isWs$iv == '\t')) { current++; continue; }  this.currentPosition = current; return isValidValueStart(c); }  this.currentPosition = current; return false; } public int skipWhitespaces() { int current = this.currentPosition; if (current == -1)
/* 132 */       return current;  String source = getSource(); while (current < source.length()) { char c = source.charAt(current); StringJsonLexer stringJsonLexer = this; char $this$isWs$iv = c; int $i$f$isWs = 0; if (($this$isWs$iv == ' ' || $this$isWs$iv == '\n' || $this$isWs$iv == '\r' || $this$isWs$iv == '\t')) current++;  }  this.currentPosition = current; return current; } public void consumeNextToken(char expected) { if (this.currentPosition == -1)
/* 133 */       unexpectedToken(expected);  String source = getSource(); int cpos = this.currentPosition; while (cpos < source.length()) { char c = source.charAt(cpos++); StringJsonLexer stringJsonLexer = this; char $this$isWs$iv = c; int $i$f$isWs = 0; if (!(($this$isWs$iv == ' ' || $this$isWs$iv == '\n' || $this$isWs$iv == '\r' || $this$isWs$iv == '\t') ? 1 : 0)) { this.currentPosition = cpos; if (c == expected)
/* 134 */           return;  unexpectedToken(expected); }  }  this.currentPosition = -1; unexpectedToken(expected); } @NotNull public String consumeKeyString() { consumeNextToken('"'); int current = this.currentPosition; int closingQuote = StringsKt.indexOf$default(getSource(), '"', current, false, 4, null); if (closingQuote == -1) { consumeStringLenient(); boolean bool = true; boolean wasConsumed$iv = false; int $i$f$fail$kotlinx_serialization_json = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 140 */       String expected$iv = AbstractJsonLexerKt.tokenDescription(bool);
/* 141 */       int position$iv = this.currentPosition;
/* 142 */       String s$iv = (this.currentPosition == AbstractJsonLexer.access$getSource(this).length() || position$iv < 0) ? "EOF" : String.valueOf(AbstractJsonLexer.access$getSource(this).charAt(position$iv));
/* 143 */       String str1 = s$iv, str2 = expected$iv; StringJsonLexer stringJsonLexer = this; int $i$a$-fail$kotlinx_serialization_json-AbstractJsonLexer$fail$1 = 0; str1 = str1; String expected = str2; AbstractJsonLexer.fail$default(
/* 144 */           stringJsonLexer, "Expected " + expected + ", but had '" + str1 + "' instead", position$iv, null, 4, null); throw new KotlinNothingValueException(); }  for (int i = current; i < closingQuote; i++) { if (getSource().charAt(i) == '\\')
/* 145 */         return consumeString(getSource(), this.currentPosition, i);  }  this.currentPosition = closingQuote + 1; Intrinsics.checkNotNullExpressionValue(getSource().substring(current, closingQuote), "substring(...)"); return getSource().substring(current, closingQuote); } public void consumeStringChunked(boolean isLenient, @NotNull Function1 consumeChunk) { Intrinsics.checkNotNullParameter(consumeChunk, "consumeChunk"); Iterable $this$forEach$iv = StringsKt.chunked(isLenient ? consumeStringLenient() : consumeString(), 16384); int $i$f$forEach = 0; for (Object element$iv : $this$forEach$iv) consumeChunk.invoke(element$iv);  }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public String peekLeadingMatchingValue(@NotNull String keyToMatch, boolean isLenient) {
/*     */     Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
/*     */     int positionSnapshot = this.currentPosition;
/*     */     try {
/*     */       if (consumeNextToken() != 6)
/*     */         return null; 
/*     */       String firstKey = peekString(isLenient);
/*     */       if (!Intrinsics.areEqual(firstKey, keyToMatch))
/*     */         return null; 
/*     */       discardPeeked();
/*     */       if (consumeNextToken() != 5)
/*     */         return null; 
/*     */       return peekString(isLenient);
/*     */     } finally {
/*     */       this.currentPosition = positionSnapshot;
/*     */       discardPeeked();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\StringJsonLexer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */