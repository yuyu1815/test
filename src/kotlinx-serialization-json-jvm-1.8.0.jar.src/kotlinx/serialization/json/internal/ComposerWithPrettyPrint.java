/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.serialization.json.Json;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\020\002\n\002\b\005\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\b\020\n\032\0020\013H\026J\b\020\f\032\0020\013H\026J\b\020\r\032\0020\013H\026J\b\020\016\032\0020\013H\026J\b\020\017\032\0020\013H\026R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\b\032\0020\tX\016¢\006\002\n\000¨\006\020"}, d2 = {"Lkotlinx/serialization/json/internal/ComposerWithPrettyPrint;", "Lkotlinx/serialization/json/internal/Composer;", "writer", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;Lkotlinx/serialization/json/Json;)V", "level", "", "indent", "", "unIndent", "nextItem", "nextItemIfNotFirst", "space", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nComposers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composers.kt\nkotlinx/serialization/json/internal/ComposerWithPrettyPrint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,104:1\n1#2:105\n*E\n"})
/*     */ public final class ComposerWithPrettyPrint
/*     */   extends Composer
/*     */ {
/*     */   @NotNull
/*     */   private final Json json;
/*     */   private int level;
/*     */   
/*     */   public ComposerWithPrettyPrint(@NotNull InternalJsonWriter writer, @NotNull Json json) {
/*  77 */     super(writer);
/*     */     this.json = json;
/*     */   }
/*     */   public void indent() {
/*  81 */     setWritingFirst(true);
/*  82 */     int i = this.level; this.level = i + 1;
/*     */   }
/*     */   
/*     */   public void unIndent() {
/*  86 */     int i = this.level; this.level = i + -1;
/*     */   }
/*     */   
/*     */   public void nextItem() {
/*  90 */     setWritingFirst(false);
/*  91 */     print("\n"); int i; byte b;
/*  92 */     for (i = this.level, b = 0; b < i; ) { int it = b;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 105 */       int $i$a$-repeat-ComposerWithPrettyPrint$nextItem$1 = 0;
/*     */       print(this.json.getConfiguration().getPrettyPrintIndent());
/*     */       b++; }
/*     */   
/*     */   }
/*     */   
/*     */   public void nextItemIfNotFirst() {
/*     */     if (getWritingFirst()) {
/*     */       setWritingFirst(false);
/*     */     } else {
/*     */       nextItem();
/*     */     } 
/*     */   }
/*     */   
/*     */   public void space() {
/*     */     print(' ');
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\ComposerWithPrettyPrint.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */