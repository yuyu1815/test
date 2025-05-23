/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\005\n\000\n\002\020\013\n\002\020\002\n\000\n\002\020\f\n\002\b\002\n\002\020\b\n\000\b\000\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\006\032\0020\007H\026J\b\020\b\032\0020\tH\026J\020\020\006\032\0020\n2\006\020\013\032\0020\fH\026J\b\020\r\032\0020\007H\026J\b\020\016\032\0020\017H\026¨\006\020"}, d2 = {"Lkotlinx/serialization/json/internal/StringJsonLexerWithComments;", "Lkotlinx/serialization/json/internal/StringJsonLexer;", "source", "", "<init>", "(Ljava/lang/String;)V", "consumeNextToken", "", "canConsumeValue", "", "", "expected", "", "peekNextToken", "skipWhitespaces", "", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nCommentLexers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/StringJsonLexerWithComments\n+ 2 AbstractJsonLexer.kt\nkotlinx/serialization/json/internal/AbstractJsonLexer\n*L\n1#1,219:1\n158#2:220\n*S KotlinDebug\n*F\n+ 1 CommentLexers.kt\nkotlinx/serialization/json/internal/StringJsonLexerWithComments\n*L\n66#1:220\n*E\n"})
/*     */ public final class StringJsonLexerWithComments
/*     */   extends StringJsonLexer
/*     */ {
/*     */   public StringJsonLexerWithComments(@NotNull String source) {
/*  21 */     super(source);
/*     */   } public byte consumeNextToken() {
/*  23 */     String source = getSource();
/*  24 */     int cpos = skipWhitespaces();
/*  25 */     if (cpos >= source.length() || cpos == -1) return 10; 
/*  26 */     this.currentPosition = cpos + 1;
/*  27 */     return AbstractJsonLexerKt.charToTokenClass(source.charAt(cpos));
/*     */   }
/*     */   
/*     */   public boolean canConsumeValue() {
/*  31 */     int current = skipWhitespaces();
/*  32 */     if (current >= getSource().length() || current == -1) return false; 
/*  33 */     return isValidValueStart(getSource().charAt(current));
/*     */   }
/*     */   
/*     */   public void consumeNextToken(char expected) {
/*  37 */     String source = getSource();
/*  38 */     int current = skipWhitespaces();
/*  39 */     if (current >= source.length() || current == -1) {
/*  40 */       this.currentPosition = -1;
/*  41 */       unexpectedToken(expected);
/*     */     } 
/*  43 */     char c = source.charAt(current);
/*  44 */     this.currentPosition = current + 1;
/*  45 */     if (c == expected)
/*  46 */       return;  unexpectedToken(expected);
/*     */   }
/*     */   
/*     */   public byte peekNextToken() {
/*  50 */     String source = getSource();
/*  51 */     int cpos = skipWhitespaces();
/*     */     
/*  53 */     if (cpos >= source.length() || cpos == -1) return 10; 
/*  54 */     this.currentPosition = cpos;
/*  55 */     return AbstractJsonLexerKt.charToTokenClass(source.charAt(cpos));
/*     */   }
/*     */   
/*     */   public int skipWhitespaces() {
/*  59 */     int current = this.currentPosition;
/*  60 */     if (current == -1) return current; 
/*  61 */     String source = getSource();
/*     */     
/*  63 */     while (current < source.length()) {
/*  64 */       char c = source.charAt(current);
/*     */       
/*  66 */       StringJsonLexerWithComments stringJsonLexerWithComments = this; char $this$isWs$iv = c; int $i$f$isWs = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 220 */       if (($this$isWs$iv == ' ' || $this$isWs$iv == '\n' || $this$isWs$iv == '\r' || $this$isWs$iv == '\t')) {
/*     */         current++;
/*     */         continue;
/*     */       } 
/*     */       if (c == '/' && current + 1 < source.length())
/*     */         switch (source.charAt(current + 1)) {
/*     */           case '/':
/*     */             current = StringsKt.indexOf$default(source, '\n', current + 2, false, 4, null);
/*     */             if (current == -1) {
/*     */               current = source.length();
/*     */               continue;
/*     */             } 
/*     */             current++;
/*     */           case '*':
/*     */             current = StringsKt.indexOf$default(source, "*/", current + 2, false, 4, null);
/*     */             if (current == -1) {
/*     */               this.currentPosition = source.length();
/*     */               AbstractJsonLexer.fail$default(this, "Expected end of the block comment: \"*/\", but had EOF instead", 0, null, 6, null);
/*     */               throw new KotlinNothingValueException();
/*     */             } 
/*     */             current += 2;
/*     */         }  
/*     */     } 
/*     */     this.currentPosition = current;
/*     */     return current;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\StringJsonLexerWithComments.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */