/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.JvmField;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000F\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\013\n\002\b\006\n\002\020\002\n\002\b\006\n\002\020\f\n\002\020\016\n\002\020\007\n\002\020\006\n\002\020\005\n\002\020\n\n\002\020\b\n\002\020\t\n\002\b\002\b\020\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005J\b\020\r\032\0020\016H\026J\b\020\017\032\0020\016H\026J\b\020\020\032\0020\016H\026J\b\020\021\032\0020\016H\026J\b\020\022\032\0020\016H\026J\016\020\023\032\0020\0162\006\020\024\032\0020\025J\016\020\023\032\0020\0162\006\020\024\032\0020\026J\020\020\023\032\0020\0162\006\020\024\032\0020\027H\026J\020\020\023\032\0020\0162\006\020\024\032\0020\030H\026J\020\020\023\032\0020\0162\006\020\024\032\0020\031H\026J\020\020\023\032\0020\0162\006\020\024\032\0020\032H\026J\020\020\023\032\0020\0162\006\020\024\032\0020\033H\026J\020\020\023\032\0020\0162\006\020\024\032\0020\034H\026J\020\020\023\032\0020\0162\006\020\024\032\0020\007H\026J\020\020\035\032\0020\0162\006\020\006\032\0020\026H\026R\020\020\002\032\0020\0038\000X\004¢\006\002\n\000R$\020\b\032\0020\0072\006\020\006\032\0020\007@DX\016¢\006\016\n\000\032\004\b\t\020\n\"\004\b\013\020\f¨\006\036"}, d2 = {"Lkotlinx/serialization/json/internal/Composer;", "", "writer", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "<init>", "(Lkotlinx/serialization/json/internal/InternalJsonWriter;)V", "value", "", "writingFirst", "getWritingFirst", "()Z", "setWritingFirst", "(Z)V", "indent", "", "unIndent", "nextItem", "nextItemIfNotFirst", "space", "print", "v", "", "", "", "", "", "", "", "", "printQuoted", "kotlinx-serialization-json"})
/*    */ public class Composer {
/*    */   @JvmField
/*    */   @NotNull
/*    */   public final InternalJsonWriter writer;
/*    */   private boolean writingFirst;
/*    */   
/*    */   public Composer(@NotNull InternalJsonWriter writer) {
/* 16 */     this.writer = writer;
/* 17 */     this.writingFirst = true; } public final boolean getWritingFirst() { return this.writingFirst; } protected final void setWritingFirst(boolean <set-?>) {
/* 18 */     this.writingFirst = <set-?>;
/*    */   }
/*    */   public void indent() {
/* 21 */     this.writingFirst = true;
/*    */   }
/*    */   
/*    */   public void unIndent() {}
/*    */   
/*    */   public void nextItem() {
/* 27 */     this.writingFirst = false;
/*    */   }
/*    */   
/*    */   public void nextItemIfNotFirst() {
/* 31 */     this.writingFirst = false;
/*    */   }
/*    */   
/*    */   public void space() {}
/*    */   
/* 36 */   public final void print(char v) { this.writer.writeChar(v); }
/* 37 */   public final void print(@NotNull String v) { Intrinsics.checkNotNullParameter(v, "v"); this.writer.write(v); }
/* 38 */   public void print(float v) { this.writer.write(String.valueOf(v)); }
/* 39 */   public void print(double v) { this.writer.write(String.valueOf(v)); }
/* 40 */   public void print(byte v) { this.writer.writeLong(v); }
/* 41 */   public void print(short v) { this.writer.writeLong(v); }
/* 42 */   public void print(int v) { this.writer.writeLong(v); }
/* 43 */   public void print(long v) { this.writer.writeLong(v); }
/* 44 */   public void print(boolean v) { this.writer.write(String.valueOf(v)); } public void printQuoted(@NotNull String value) {
/* 45 */     Intrinsics.checkNotNullParameter(value, "value"); this.writer.writeQuoted(value);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\Composer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */