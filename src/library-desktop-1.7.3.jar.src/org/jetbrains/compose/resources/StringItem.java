/*    */ package org.jetbrains.compose.resources;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\032\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bp\030\0002\0020\001:\003\002\003\004\001\003\005\006\007¨\006\b"}, d2 = {"Lorg/jetbrains/compose/resources/StringItem;", "", "Array", "Plurals", "Value", "Lorg/jetbrains/compose/resources/StringItem$Array;", "Lorg/jetbrains/compose/resources/StringItem$Plurals;", "Lorg/jetbrains/compose/resources/StringItem$Value;", "library"})
/*    */ public interface StringItem {
/*    */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\r\022\006\020\002\032\0020\003¢\006\002\020\004J\t\020\007\032\0020\003HÆ\003J\023\020\b\032\0020\0002\b\b\002\020\002\032\0020\003HÆ\001J\023\020\t\032\0020\n2\b\020\013\032\004\030\0010\fHÖ\003J\t\020\r\032\0020\016HÖ\001J\t\020\017\032\0020\003HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\005\020\006¨\006\020"}, d2 = {"Lorg/jetbrains/compose/resources/StringItem$Value;", "Lorg/jetbrains/compose/resources/StringItem;", "text", "", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "library"})
/*    */   @StabilityInferred(parameters = 1)
/*    */   public static final class Value implements StringItem {
/*    */     @NotNull
/*    */     private final String text;
/*    */     public static final int $stable;
/*    */     
/* 13 */     public Value(@NotNull String text) { this.text = text; } @NotNull public final String getText() { return this.text; } @NotNull public final String component1() { return this.text; } @NotNull public final Value copy(@NotNull String text) { Intrinsics.checkNotNullParameter(text, "text"); return new Value(text); } @NotNull public String toString() { return "Value(text=" + this.text + ")"; } public int hashCode() { return this.text.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Value)) return false;  Value value = (Value)other; return !!Intrinsics.areEqual(this.text, value.text); }
/* 14 */   } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020$\n\002\030\002\n\002\020\016\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\031\022\022\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\002\020\006J\025\020\t\032\016\022\004\022\0020\004\022\004\022\0020\0050\003HÆ\003J\037\020\n\032\0020\0002\024\b\002\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003HÆ\001J\023\020\013\032\0020\f2\b\020\r\032\004\030\0010\016HÖ\003J\t\020\017\032\0020\020HÖ\001J\t\020\021\032\0020\005HÖ\001R\035\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003¢\006\b\n\000\032\004\b\007\020\b¨\006\022"}, d2 = {"Lorg/jetbrains/compose/resources/StringItem$Plurals;", "Lorg/jetbrains/compose/resources/StringItem;", "items", "", "Lorg/jetbrains/compose/resources/plural/PluralCategory;", "", "(Ljava/util/Map;)V", "getItems", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "library"}) @StabilityInferred(parameters = 0) public static final class Plurals implements StringItem { @NotNull private final Map<PluralCategory, String> items; public Plurals(@NotNull Map<PluralCategory, String> items) { this.items = items; } public static final int $stable = 8; @NotNull public final Map<PluralCategory, String> getItems() { return this.items; } @NotNull public final Map<PluralCategory, String> component1() { return this.items; } @NotNull public final Plurals copy(@NotNull Map<PluralCategory, String> items) { Intrinsics.checkNotNullParameter(items, "items"); return new Plurals(items); } @NotNull public String toString() { return "Plurals(items=" + this.items + ")"; } public int hashCode() { return this.items.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof Plurals)) return false;  Plurals plurals = (Plurals)other; return !!Intrinsics.areEqual(this.items, plurals.items); } } @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\020 \n\002\020\016\n\002\b\006\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\023\022\f\020\002\032\b\022\004\022\0020\0040\003¢\006\002\020\005J\017\020\b\032\b\022\004\022\0020\0040\003HÆ\003J\031\020\t\032\0020\0002\016\b\002\020\002\032\b\022\004\022\0020\0040\003HÆ\001J\023\020\n\032\0020\0132\b\020\f\032\004\030\0010\rHÖ\003J\t\020\016\032\0020\017HÖ\001J\t\020\020\032\0020\004HÖ\001R\027\020\002\032\b\022\004\022\0020\0040\003¢\006\b\n\000\032\004\b\006\020\007¨\006\021"}, d2 = {"Lorg/jetbrains/compose/resources/StringItem$Array;", "Lorg/jetbrains/compose/resources/StringItem;", "items", "", "", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "library"}) @StabilityInferred(parameters = 0) public static final class Array implements StringItem { @NotNull private final List<String> items; public static final int $stable = 8;
/* 15 */     public Array(@NotNull List<String> items) { this.items = items; } @NotNull public final List<String> getItems() { return this.items; }
/*    */ 
/*    */     
/*    */     @NotNull
/*    */     public final List<String> component1() {
/*    */       return this.items;
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Array copy(@NotNull List<String> items) {
/*    */       Intrinsics.checkNotNullParameter(items, "items");
/*    */       return new Array(items);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public String toString() {
/*    */       return "Array(items=" + this.items + ")";
/*    */     }
/*    */     
/*    */     public int hashCode() {
/*    */       return this.items.hashCode();
/*    */     }
/*    */     
/*    */     public boolean equals(@Nullable Object other) {
/*    */       if (this == other)
/*    */         return true; 
/*    */       if (!(other instanceof Array))
/*    */         return false; 
/*    */       Array array = (Array)other;
/*    */       return !!Intrinsics.areEqual(this.items, array.items);
/*    */     } }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\StringItem.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */