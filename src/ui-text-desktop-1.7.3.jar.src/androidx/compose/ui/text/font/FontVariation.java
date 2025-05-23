/*     */ package androidx.compose.ui.text.font;
/*     */ 
/*     */ import androidx.compose.runtime.Immutable;
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.unit.Density;
/*     */ import androidx.compose.ui.unit.TextUnit;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.SpreadBuilder;
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
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000H\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\007\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\021\n\002\b\003\n\002\020\b\n\002\b\003\n\002\030\002\n\002\b\b\bÇ\002\030\0002\0020\001:\005\003\035\036\037\tB\007\b\002¢\006\002\020\002J\026\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\bJ4\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\0162\022\020\017\032\n\022\006\b\001\022\0020\0040\020\"\0020\004ø\001\000¢\006\004\b\021\020\022J\016\020\023\032\0020\0042\006\020\007\032\0020\024J\016\020\025\032\0020\0042\006\020\007\032\0020\bJ\030\020\026\032\0020\0042\006\020\027\032\0020\030ø\001\000¢\006\004\b\031\020\032J\016\020\033\032\0020\0042\006\020\007\032\0020\bJ\016\020\013\032\0020\0042\006\020\007\032\0020\024J\016\020\034\032\0020\0042\006\020\007\032\0020\b\002\007\n\005\b¡\0360\001¨\006 "}, d2 = {"Landroidx/compose/ui/text/font/FontVariation;", "", "()V", "Setting", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "name", "", "value", "", "Settings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "settings", "", "Settings-6EWAqTQ", "(Landroidx/compose/ui/text/font/FontWeight;I[Landroidx/compose/ui/text/font/FontVariation$Setting;)Landroidx/compose/ui/text/font/FontVariation$Settings;", "grade", "", "italic", "opticalSizing", "textSize", "Landroidx/compose/ui/unit/TextUnit;", "opticalSizing--R2X_6o", "(J)Landroidx/compose/ui/text/font/FontVariation$Setting;", "slant", "width", "SettingFloat", "SettingInt", "SettingTextUnit", "ui-text"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ public final class FontVariation
/*     */ {
/*     */   @NotNull
/*     */   public static final FontVariation INSTANCE = new FontVariation();
/*     */   public static final int $stable;
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\020\021\n\002\030\002\n\002\b\002\n\002\020\013\n\002\b\002\n\002\020 \n\002\b\005\n\002\020\b\n\000\b\007\030\0002\0020\001B\031\022\022\020\002\032\n\022\006\b\001\022\0020\0040\003\"\0020\004¢\006\002\020\005J\023\020\r\032\0020\0072\b\020\016\032\004\030\0010\001H\002J\b\020\017\032\0020\020H\026R\024\020\006\032\0020\007X\004¢\006\b\n\000\032\004\b\b\020\tR\027\020\002\032\b\022\004\022\0020\0040\n¢\006\b\n\000\032\004\b\013\020\f¨\006\021"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Settings;", "", "settings", "", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "([Landroidx/compose/ui/text/font/FontVariation$Setting;)V", "needsDensity", "", "getNeedsDensity$ui_text", "()Z", "", "getSettings", "()Ljava/util/List;", "equals", "other", "hashCode", "", "ui-text"})
/*     */   @Immutable
/*     */   @SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,373:1\n10513#2:374\n10738#2,3:375\n10741#2,3:385\n372#3,7:378\n76#4:388\n96#4,5:389\n101#5,2:394\n33#5,6:396\n103#5:402\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n52#1:374\n52#1:375,3\n52#1:385,3\n52#1:378,7\n53#1:388\n53#1:389,5\n60#1:394,2\n60#1:396,6\n60#1:402\n*E\n"})
/*     */   public static final class Settings
/*     */   {
/*     */     @NotNull
/*     */     private final List<FontVariation.Setting> settings;
/*     */     private final boolean needsDensity;
/*     */     public static final int $stable;
/*     */     
/*     */     public Settings(@NotNull FontVariation.Setting... settings) {
/*  51 */       FontVariation.Setting[] arrayOfSetting1 = settings;
/*  52 */       Settings settings1 = this; int $i$f$groupBy = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 374 */       FontVariation.Setting[] arrayOfSetting2 = arrayOfSetting1; Map<Object, Object> map3 = new LinkedHashMap<>(); int $i$f$groupByTo = 0; int i, j;
/* 375 */       for (i = 0, j = arrayOfSetting2.length; i < j; ) { Object element$iv$iv = arrayOfSetting2[i];
/* 376 */         Object object1 = element$iv$iv; int $i$a$-groupBy-FontVariation$Settings$1 = 0; Object key$iv$iv = object1.getAxisName();
/* 377 */         Map<Object, Object> $this$getOrPut$iv$iv$iv = map3; int $i$f$getOrPut = 0;
/* 378 */         Object value$iv$iv$iv = $this$getOrPut$iv$iv$iv.get(key$iv$iv); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 387 */       Map<Object, Object> map1 = map3; settings1 = settings1; int $i$f$flatMap = 0;
/* 388 */       Map<Object, Object> map2 = map1; Collection destination$iv$iv = new ArrayList(); int $i$f$flatMapTo = 0;
/* 389 */       for (Map.Entry<Object, Object> element$iv$iv : map2.entrySet()) {
/* 390 */         Map.Entry<Object, Object> entry1 = element$iv$iv; int $i$a$-flatMap-FontVariation$Settings$2 = 0; String key = (String)entry1.getKey();
/*     */         List value = (List)entry1.getValue();
/*     */       } 
/* 393 */       List<? extends FontVariation.Setting> list = (List)destination$iv$iv; settings1.settings = new ArrayList<>(list); List<FontVariation.Setting> list1 = this.settings; settings1 = this;
/*     */       int $i$f$fastAny = 0;
/* 395 */       List<FontVariation.Setting> $this$fastForEach$iv$iv = list1; int $i$f$fastForEach = 0;
/*     */       
/* 397 */       int index$iv$iv = 0; i = $this$fastForEach$iv$iv.size(); if (index$iv$iv < i);
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 402 */       boolean bool = false; settings1.needsDensity = bool;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final List<FontVariation.Setting> getSettings() {
/*     */       return this.settings;
/*     */     }
/*     */     
/*     */     public final boolean getNeedsDensity$ui_text() {
/*     */       return this.needsDensity;
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof Settings))
/*     */         return false; 
/*     */       if (!Intrinsics.areEqual(this.settings, ((Settings)other).settings))
/*     */         return false; 
/*     */       return true;
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       return this.settings.hashCode();
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\007\n\002\b\004\n\002\020\013\n\002\b\006\n\002\020\000\n\000\n\002\020\b\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\023\020\017\032\0020\n2\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\023H\026J\b\020\024\032\0020\003H\026J\022\020\025\032\0020\0052\b\020\026\032\004\030\0010\027H\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016¨\006\030"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingFloat;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "axisName", "", "value", "", "(Ljava/lang/String;F)V", "getAxisName", "()Ljava/lang/String;", "needsDensity", "", "getNeedsDensity", "()Z", "getValue", "()F", "equals", "other", "", "hashCode", "", "toString", "toVariationValue", "density", "Landroidx/compose/ui/unit/Density;", "ui-text"})
/*     */   @Immutable
/*     */   private static final class SettingFloat implements Setting {
/*     */     @NotNull
/*     */     private final String axisName;
/*     */     private final float value;
/*     */     private final boolean needsDensity;
/*     */     
/*     */     public SettingFloat(@NotNull String axisName, float value) {
/*     */       this.axisName = axisName;
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getAxisName() {
/*     */       return this.axisName;
/*     */     }
/*     */     
/*     */     public final float getValue() {
/*     */       return this.value;
/*     */     }
/*     */     
/*     */     public float toVariationValue(@Nullable Density density) {
/*     */       return this.value;
/*     */     }
/*     */     
/*     */     public boolean getNeedsDensity() {
/*     */       return this.needsDensity;
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof SettingFloat))
/*     */         return false; 
/*     */       if (!Intrinsics.areEqual(getAxisName(), ((SettingFloat)other).getAxisName()))
/*     */         return false; 
/*     */       if (!((this.value == ((SettingFloat)other).value) ? 1 : 0))
/*     */         return false; 
/*     */       return true;
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       int result = getAxisName().hashCode();
/*     */       result = 31 * result + Float.hashCode(this.value);
/*     */       return result;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000:\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\002\b\007\n\002\020\000\n\000\n\002\020\b\n\002\b\002\n\002\020\007\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\023\020\020\032\0020\n2\b\020\021\032\004\030\0010\022H\002J\b\020\023\032\0020\024H\026J\b\020\025\032\0020\003H\026J\022\020\026\032\0020\0272\b\020\030\032\004\030\0010\031H\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\031\020\004\032\0020\005ø\001\000ø\001\001¢\006\n\n\002\020\017\032\004\b\r\020\016\002\013\n\005\b¡\0360\001\n\002\b!¨\006\032"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingTextUnit;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "axisName", "", "value", "Landroidx/compose/ui/unit/TextUnit;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAxisName", "()Ljava/lang/String;", "needsDensity", "", "getNeedsDensity", "()Z", "getValue-XSAIIZE", "()J", "J", "equals", "other", "", "hashCode", "", "toString", "toVariationValue", "", "density", "Landroidx/compose/ui/unit/Density;", "ui-text"})
/*     */   @Immutable
/*     */   @SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$SettingTextUnit\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,373:1\n1#2:374\n*E\n"})
/*     */   private static final class SettingTextUnit implements Setting {
/*     */     @NotNull
/*     */     private final String axisName;
/*     */     private final long value;
/*     */     private final boolean needsDensity;
/*     */     
/*     */     private SettingTextUnit(String axisName, long value) {
/*     */       this.axisName = axisName;
/*     */       this.value = value;
/*     */       this.needsDensity = true;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getAxisName() {
/*     */       return this.axisName;
/*     */     }
/*     */     
/*     */     public final long getValue-XSAIIZE() {
/*     */       return this.value;
/*     */     }
/*     */     
/*     */     public float toVariationValue(@Nullable Density density) {
/*     */       if (density == null) {
/*     */         int $i$a$-requireNotNull-FontVariation$SettingTextUnit$toVariationValue$1 = 0;
/*     */         String str = "density must not be null";
/*     */         throw new IllegalArgumentException(str.toString());
/*     */       } 
/*     */       return TextUnit.getValue-impl(this.value) * density.getFontScale();
/*     */     }
/*     */     
/*     */     public boolean getNeedsDensity() {
/*     */       return this.needsDensity;
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof SettingTextUnit))
/*     */         return false; 
/*     */       if (!Intrinsics.areEqual(getAxisName(), ((SettingTextUnit)other).getAxisName()))
/*     */         return false; 
/*     */       if (!TextUnit.equals-impl0(this.value, ((SettingTextUnit)other).value))
/*     */         return false; 
/*     */       return true;
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       int result = getAxisName().hashCode();
/*     */       result = 31 * result + TextUnit.hashCode-impl(this.value);
/*     */       return result;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + TextUnit.toString-impl(this.value) + ')';
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\004\n\002\020\013\n\002\b\006\n\002\020\000\n\002\b\003\n\002\020\007\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\023\020\017\032\0020\n2\b\020\020\032\004\030\0010\021H\002J\b\020\022\032\0020\005H\026J\b\020\023\032\0020\003H\026J\022\020\024\032\0020\0252\b\020\026\032\004\030\0010\027H\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\007\020\bR\024\020\t\032\0020\nXD¢\006\b\n\000\032\004\b\013\020\fR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\r\020\016¨\006\030"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$SettingInt;", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "axisName", "", "value", "", "(Ljava/lang/String;I)V", "getAxisName", "()Ljava/lang/String;", "needsDensity", "", "getNeedsDensity", "()Z", "getValue", "()I", "equals", "other", "", "hashCode", "toString", "toVariationValue", "", "density", "Landroidx/compose/ui/unit/Density;", "ui-text"})
/*     */   @Immutable
/*     */   private static final class SettingInt implements Setting {
/*     */     @NotNull
/*     */     private final String axisName;
/*     */     private final int value;
/*     */     private final boolean needsDensity;
/*     */     
/*     */     public SettingInt(@NotNull String axisName, int value) {
/*     */       this.axisName = axisName;
/*     */       this.value = value;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getAxisName() {
/*     */       return this.axisName;
/*     */     }
/*     */     
/*     */     public final int getValue() {
/*     */       return this.value;
/*     */     }
/*     */     
/*     */     public float toVariationValue(@Nullable Density density) {
/*     */       return this.value;
/*     */     }
/*     */     
/*     */     public boolean getNeedsDensity() {
/*     */       return this.needsDensity;
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof SettingInt))
/*     */         return false; 
/*     */       if (!Intrinsics.areEqual(getAxisName(), ((SettingInt)other).getAxisName()))
/*     */         return false; 
/*     */       if (this.value != ((SettingInt)other).value)
/*     */         return false; 
/*     */       return true;
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       int result = getAxisName().hashCode();
/*     */       result = 31 * result + this.value;
/*     */       return result;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "FontVariation.Setting(axisName='" + getAxisName() + "', value=" + this.value + ')';
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Setting Setting(@NotNull String name, float value) {
/*     */     Intrinsics.checkNotNullParameter(name, "name");
/*     */     if (!((name.length() == 4) ? 1 : 0)) {
/*     */       int $i$a$-require-FontVariation$Setting$1 = 0;
/*     */       String str = "Name must be exactly four characters. Actual: '" + name + '\'';
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     return new SettingFloat(name, value);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Setting italic(float value) {
/*     */     if (!((0.0F <= value) ? ((value <= 1.0F) ? 1 : 0) : 0)) {
/*     */       int $i$a$-require-FontVariation$italic$1 = 0;
/*     */       String str = "'ital' must be in 0.0f..1.0f. Actual: " + value;
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     return new SettingFloat("ital", value);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Setting opticalSizing--R2X_6o(long textSize) {
/*     */     if (!TextUnit.isSp-impl(textSize)) {
/*     */       int $i$a$-require-FontVariation$opticalSizing$1 = 0;
/*     */       String str = "'opsz' must be provided in sp units";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     return new SettingTextUnit("opsz", textSize, null);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Setting slant(float value) {
/*     */     if (!((-90.0F <= value) ? ((value <= 90.0F) ? 1 : 0) : 0)) {
/*     */       int $i$a$-require-FontVariation$slant$1 = 0;
/*     */       String str = "'slnt' must be in -90f..90f. Actual: " + value;
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     return new SettingFloat("slnt", value);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Setting width(float value) {
/*     */     if (!((value > 0.0F) ? 1 : 0)) {
/*     */       int $i$a$-require-FontVariation$width$1 = 0;
/*     */       String str = "'wdth' must be strictly > 0.0f. Actual: " + value;
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     return new SettingFloat("wdth", value);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Setting weight(int value) {
/*     */     if (!((1 <= value) ? ((value < 1001) ? 1 : 0) : 0)) {
/*     */       int $i$a$-require-FontVariation$weight$1 = 0;
/*     */       String str = "'wght' value must be in [1, 1000]. Actual: " + value;
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     return new SettingInt("wght", value);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Setting grade(int value) {
/*     */     if (!((-1000 <= value) ? ((value < 1001) ? 1 : 0) : 0)) {
/*     */       int $i$a$-require-FontVariation$grade$1 = 0;
/*     */       String str = "'GRAD' must be in -1000..1000";
/*     */       throw new IllegalArgumentException(str.toString());
/*     */     } 
/*     */     return new SettingInt("GRAD", value);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public final Settings Settings-6EWAqTQ(@NotNull FontWeight weight, int style, @NotNull Setting... settings) {
/*     */     Intrinsics.checkNotNullParameter(weight, "weight");
/*     */     Intrinsics.checkNotNullParameter(settings, "settings");
/*     */     SpreadBuilder spreadBuilder = new SpreadBuilder(3);
/*     */     spreadBuilder.add(weight(weight.getWeight()));
/*     */     spreadBuilder.add(italic(style));
/*     */     spreadBuilder.addSpread(settings);
/*     */     return new Settings((Setting[])spreadBuilder.toArray((Object[])new Setting[spreadBuilder.size()]));
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\002\b\003\n\002\020\013\n\002\b\003\n\002\020\007\n\000\n\002\030\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\bw\030\0002\0020\001J\022\020\n\032\0020\0132\b\020\f\032\004\030\0010\rH&R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005R\022\020\006\032\0020\007X¦\004¢\006\006\032\004\b\b\020\t\001\003\016\017\020ø\001\000\002\006\n\004\b!0\001¨\006\021À\006\001"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Setting;", "", "axisName", "", "getAxisName", "()Ljava/lang/String;", "needsDensity", "", "getNeedsDensity", "()Z", "toVariationValue", "", "density", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/text/font/FontVariation$SettingFloat;", "Landroidx/compose/ui/text/font/FontVariation$SettingInt;", "Landroidx/compose/ui/text/font/FontVariation$SettingTextUnit;", "ui-text"})
/*     */   @Immutable
/*     */   public static interface Setting {
/*     */     float toVariationValue(@Nullable Density param1Density);
/*     */     
/*     */     boolean getNeedsDensity();
/*     */     
/*     */     @NotNull
/*     */     String getAxisName();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\FontVariation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */