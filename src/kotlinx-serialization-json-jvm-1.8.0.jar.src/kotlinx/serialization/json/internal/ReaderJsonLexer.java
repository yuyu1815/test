/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.ArraysKt;
/*     */ import kotlin.jvm.JvmField;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000J\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\031\n\002\b\007\n\002\020\b\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\000\n\002\020\002\n\002\b\004\n\002\020\005\n\000\n\002\020\f\n\002\b\003\n\002\020\016\n\002\b\r\b\020\030\0002\0020\001B\031\022\006\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\004\b\006\020\007J\b\020\022\032\0020\023H\026J\020\020\024\032\0020\0252\006\020\026\032\0020\rH\002J\020\020\027\032\0020\r2\006\020\030\032\0020\rH\026J\b\020\031\032\0020\032H\026J\020\020\031\032\0020\0252\006\020\033\032\0020\034H\026J\b\020\035\032\0020\rH\026J\b\020\036\032\0020\025H\026J\b\020\037\032\0020 H\026J\030\020!\032\0020\r2\006\020\"\032\0020\0342\006\020#\032\0020\rH\026J\030\020$\032\0020 2\006\020#\032\0020\r2\006\020%\032\0020\rH\026J\030\020&\032\0020\0252\006\020'\032\0020\r2\006\020(\032\0020\rH\024J\032\020)\032\004\030\0010 2\006\020*\032\0020 2\006\020+\032\0020\023H\026J\006\020,\032\0020\025R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013R\022\020\f\032\0020\r8\004@\004X\016¢\006\002\n\000R\024\020\016\032\0020\017X\004¢\006\b\n\000\032\004\b\020\020\021¨\006-"}, d2 = {"Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "reader", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "buffer", "", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonReader;[C)V", "getReader", "()Lkotlinx/serialization/json/internal/InternalJsonReader;", "getBuffer", "()[C", "threshold", "", "source", "Lkotlinx/serialization/json/internal/ArrayAsSequence;", "getSource", "()Lkotlinx/serialization/json/internal/ArrayAsSequence;", "canConsumeValue", "", "preload", "", "unprocessedCount", "prefetchOrEof", "position", "consumeNextToken", "", "expected", "", "skipWhitespaces", "ensureHaveChars", "consumeKeyString", "", "indexOf", "char", "startPos", "substring", "endPos", "appendRange", "fromIndex", "toIndex", "peekLeadingMatchingValue", "keyToMatch", "isLenient", "release", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nReaderJsonLexer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReaderJsonLexer.kt\nkotlinx/serialization/json/internal/ReaderJsonLexer\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n+ 3 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer$fail$1\n*L\n1#1,221:1\n158#2:222\n158#2:223\n158#2:224\n226#2,10:225\n229#3:235\n*S KotlinDebug\n*F\n+ 1 ReaderJsonLexer.kt\nkotlinx/serialization/json/internal/ReaderJsonLexer\n*L\n66#1:222\n133#1:223\n150#1:224\n181#1:225,10\n181#1:235\n*E\n"})
/*     */ public class ReaderJsonLexer
/*     */   extends AbstractJsonLexer
/*     */ {
/*     */   @NotNull
/*     */   private final InternalJsonReader reader;
/*     */   @NotNull
/*     */   private final char[] buffer;
/*     */   @JvmField
/*     */   protected int threshold;
/*     */   @NotNull
/*     */   private final ArrayAsSequence source;
/*     */   
/*     */   @NotNull
/*     */   public final InternalJsonReader getReader() {
/*  45 */     return this.reader; } @NotNull
/*  46 */   public final char[] getBuffer() { return this.buffer; } public ReaderJsonLexer(@NotNull InternalJsonReader reader, @NotNull char[] buffer) { this.reader = reader; this.buffer = buffer;
/*     */ 
/*     */ 
/*     */     
/*  50 */     this.threshold = 128;
/*     */     
/*  52 */     this.source = new ArrayAsSequence(this.buffer);
/*     */ 
/*     */     
/*  55 */     preload(0); }
/*     */   @NotNull protected ArrayAsSequence getSource() { return this.source; }
/*     */   private final void preload(int unprocessedCount) { char[] buffer = getSource().getBuffer$kotlinx_serialization_json(); if (unprocessedCount != 0) ArraysKt.copyInto(buffer, buffer, 0, this.currentPosition, this.currentPosition + unprocessedCount);  int filledCount = unprocessedCount; int sizeTotal = getSource().length(); while (filledCount != sizeTotal) { int actual = this.reader.read(buffer, filledCount, sizeTotal - filledCount); if (actual == -1) { getSource().trim(filledCount); this.threshold = -1; break; }  filledCount += actual; }  this.currentPosition = 0; }
/*     */   public int prefetchOrEof(int position) { if (position < getSource().length()) return position;  this.currentPosition = position; ensureHaveChars(); if (this.currentPosition != 0 || ((getSource().length() == 0)))
/*  59 */       return -1;  return 0; } public boolean canConsumeValue() { ensureHaveChars();
/*  60 */     int current = this.currentPosition;
/*     */     while (true)
/*  62 */     { current = prefetchOrEof(current);
/*  63 */       if (current != -1)
/*  64 */       { char c = getSource().charAt(current);
/*     */         
/*  66 */         ReaderJsonLexer readerJsonLexer = this; char $this$isWs$iv = c; int $i$f$isWs = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */         
/* 222 */         if (($this$isWs$iv == ' ' || $this$isWs$iv == '\n' || $this$isWs$iv == '\r' || $this$isWs$iv == '\t')) { current++; continue; }  this.currentPosition = current; return isValidValueStart(c); }  break; }  this.currentPosition = current; return false; }
/* 223 */   public byte consumeNextToken() { ensureHaveChars(); ArrayAsSequence source = getSource(); int cpos = this.currentPosition; while (true) { cpos = prefetchOrEof(cpos); if (cpos != -1) { char ch = source.charAt(cpos++); byte tc = AbstractJsonLexerKt.charToTokenClass(ch); if (tc != 3) { this.currentPosition = cpos; return tc; }  continue; }  break; }  this.currentPosition = cpos; return 10; } public void consumeNextToken(char expected) { ensureHaveChars(); ArrayAsSequence source = getSource(); int cpos = this.currentPosition; while (true) { cpos = prefetchOrEof(cpos); if (cpos != -1) { char c = source.charAt(cpos++); ReaderJsonLexer readerJsonLexer = this; char $this$isWs$iv = c; int $i$f$isWs = 0; if (!(($this$isWs$iv == ' ' || $this$isWs$iv == '\n' || $this$isWs$iv == '\r' || $this$isWs$iv == '\t') ? 1 : 0)) { this.currentPosition = cpos; if (c == expected)
/* 224 */             return;  unexpectedToken(expected); }  continue; }  break; }  this.currentPosition = cpos; unexpectedToken(expected); } public int skipWhitespaces() { int current = this.currentPosition; while (true) { current = prefetchOrEof(current); if (current != -1) { char c = getSource().charAt(current); ReaderJsonLexer readerJsonLexer = this; char $this$isWs$iv = c; int $i$f$isWs = 0; if (($this$isWs$iv == ' ' || $this$isWs$iv == '\n' || $this$isWs$iv == '\r' || $this$isWs$iv == '\t')) { current++; continue; }  }  break; }
/*     */      this.currentPosition = current; return current; } public void ensureHaveChars() { int cur = this.currentPosition; int oldSize = getSource().length(); int spaceLeft = oldSize - cur; if (spaceLeft > this.threshold)
/*     */       return;  preload(spaceLeft); }
/* 227 */   @NotNull public String consumeKeyString() { consumeNextToken('"'); int current = this.currentPosition; int closingQuote = indexOf('"', current); if (closingQuote == -1) { current = prefetchOrEof(current); if (current == -1) { byte expectedToken$iv = 1; boolean wasConsumed$iv = true;
/*     */         
/*     */         int $i$f$fail$kotlinx_serialization_json = 0;
/*     */         
/* 231 */         String expected$iv = AbstractJsonLexerKt.tokenDescription(expectedToken$iv);
/* 232 */         int position$iv = this.currentPosition - 1;
/* 233 */         String s$iv = (this.currentPosition == AbstractJsonLexer.access$getSource(this).length() || position$iv < 0) ? "EOF" : String.valueOf(AbstractJsonLexer.access$getSource(this).charAt(position$iv));
/* 234 */         String str1 = s$iv, str2 = expected$iv; ReaderJsonLexer readerJsonLexer = this; int $i$a$-fail$kotlinx_serialization_json-AbstractJsonLexer$fail$1 = 0; str1 = str1; String expected = str2; AbstractJsonLexer.fail$default(
/* 235 */             readerJsonLexer, "Expected " + expected + ", but had '" + str1 + "' instead", position$iv, null, 4, null);
/*     */         throw new KotlinNothingValueException(); }
/*     */       
/*     */       return consumeString(getSource(), this.currentPosition, current); }
/*     */     
/*     */     for (int i = current; i < closingQuote; i++) {
/*     */       if (getSource().charAt(i) == '\\')
/*     */         return consumeString(getSource(), this.currentPosition, i); 
/*     */     } 
/*     */     this.currentPosition = closingQuote + 1;
/*     */     return substring(current, closingQuote); }
/*     */ 
/*     */   
/*     */   public int indexOf(char char, int startPos) {
/*     */     ArrayAsSequence src = getSource();
/*     */     for (int i = startPos, j = src.length(); i < j; i++) {
/*     */       if (src.charAt(i) == char)
/*     */         return i; 
/*     */     } 
/*     */     return -1;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public String substring(int startPos, int endPos) {
/*     */     return getSource().substring(startPos, endPos);
/*     */   }
/*     */   
/*     */   protected void appendRange(int fromIndex, int toIndex) {
/*     */     StringBuilder stringBuilder = getEscapedString();
/*     */     Intrinsics.checkNotNullExpressionValue(stringBuilder.append(getSource().getBuffer$kotlinx_serialization_json(), fromIndex, toIndex - fromIndex), "append(...)");
/*     */     stringBuilder.append(getSource().getBuffer$kotlinx_serialization_json(), fromIndex, toIndex - fromIndex);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public String peekLeadingMatchingValue(@NotNull String keyToMatch, boolean isLenient) {
/*     */     Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
/*     */     return null;
/*     */   }
/*     */   
/*     */   public final void release() {
/*     */     CharArrayPoolBatchSize.INSTANCE.release(this.buffer);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\ReaderJsonLexer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */