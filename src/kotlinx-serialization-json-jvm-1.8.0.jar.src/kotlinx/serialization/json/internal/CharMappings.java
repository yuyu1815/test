/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.JvmField;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020\031\n\000\n\002\020\022\n\000\n\002\020\002\n\002\b\003\n\002\020\b\n\000\n\002\020\f\n\002\b\002\n\002\020\005\n\000\bÀ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\b\020\b\032\0020\tH\002J\b\020\n\032\0020\tH\002J\030\020\013\032\0020\t2\006\020\f\032\0020\r2\006\020\016\032\0020\017H\002J\030\020\013\032\0020\t2\006\020\f\032\0020\0172\006\020\016\032\0020\017H\002J\030\020\020\032\0020\t2\006\020\f\032\0020\r2\006\020\021\032\0020\022H\002J\030\020\020\032\0020\t2\006\020\f\032\0020\0172\006\020\021\032\0020\022H\002R\020\020\004\032\0020\0058\006X\004¢\006\002\n\000R\020\020\006\032\0020\0078\006X\004¢\006\002\n\000¨\006\023"}, d2 = {"Lkotlinx/serialization/json/internal/CharMappings;", "", "<init>", "()V", "ESCAPE_2_CHAR", "", "CHAR_TO_TOKEN", "", "initEscape", "", "initCharToToken", "initC2ESC", "c", "", "esc", "", "initC2TC", "cl", "", "kotlinx-serialization-json"})
/*     */ public final class CharMappings
/*     */ {
/*     */   @NotNull
/*  76 */   public static final CharMappings INSTANCE = new CharMappings(); @JvmField @NotNull public static final char[] ESCAPE_2_CHAR = new char[117];
/*     */   @JvmField
/*     */   @NotNull
/*  79 */   public static final byte[] CHAR_TO_TOKEN = new byte[126];
/*     */   
/*     */   static {
/*  82 */     INSTANCE.initEscape();
/*  83 */     INSTANCE.initCharToToken();
/*     */   }
/*     */   
/*     */   private final void initEscape() {
/*  87 */     for (int i = 0; i < 32; i++) {
/*  88 */       initC2ESC(i, 'u');
/*     */     }
/*     */     
/*  91 */     initC2ESC(8, 'b');
/*  92 */     initC2ESC(9, 't');
/*  93 */     initC2ESC(10, 'n');
/*  94 */     initC2ESC(12, 'f');
/*  95 */     initC2ESC(13, 'r');
/*  96 */     initC2ESC('/', '/');
/*  97 */     initC2ESC('"', '"');
/*  98 */     initC2ESC('\\', '\\');
/*     */   }
/*     */   
/*     */   private final void initCharToToken() {
/* 102 */     for (int i = 0; i < 33; i++) {
/* 103 */       initC2TC(i, 127);
/*     */     }
/*     */     
/* 106 */     initC2TC(9, (byte)3);
/* 107 */     initC2TC(10, (byte)3);
/* 108 */     initC2TC(13, (byte)3);
/* 109 */     initC2TC(32, (byte)3);
/* 110 */     initC2TC(',', (byte)4);
/* 111 */     initC2TC(':', (byte)5);
/* 112 */     initC2TC('{', (byte)6);
/* 113 */     initC2TC('}', (byte)7);
/* 114 */     initC2TC('[', (byte)8);
/* 115 */     initC2TC(']', (byte)9);
/* 116 */     initC2TC('"', (byte)1);
/* 117 */     initC2TC('\\', (byte)2);
/*     */   }
/*     */   
/*     */   private final void initC2ESC(int c, char esc) {
/* 121 */     if (esc != 'u') ESCAPE_2_CHAR[esc] = (char)c; 
/*     */   }
/*     */   private final void initC2ESC(char c, char esc) {
/* 124 */     initC2ESC(c, esc);
/*     */   }
/*     */   private final void initC2TC(int c, byte cl) {
/* 127 */     CHAR_TO_TOKEN[c] = cl;
/*     */   }
/*     */   private final void initC2TC(char c, byte cl) {
/* 130 */     initC2TC(c, cl);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\CharMappings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */