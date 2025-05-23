/*      */ package androidx.compose.ui.text;
/*      */ 
/*      */ import androidx.compose.runtime.Immutable;
/*      */ import androidx.compose.runtime.Stable;
/*      */ import androidx.compose.ui.graphics.Brush;
/*      */ import androidx.compose.ui.graphics.Color;
/*      */ import androidx.compose.ui.graphics.Shadow;
/*      */ import androidx.compose.ui.graphics.drawscope.DrawStyle;
/*      */ import androidx.compose.ui.text.font.FontFamily;
/*      */ import androidx.compose.ui.text.font.FontStyle;
/*      */ import androidx.compose.ui.text.font.FontSynthesis;
/*      */ import androidx.compose.ui.text.font.FontWeight;
/*      */ import androidx.compose.ui.text.intl.LocaleList;
/*      */ import androidx.compose.ui.text.style.BaselineShift;
/*      */ import androidx.compose.ui.text.style.Hyphens;
/*      */ import androidx.compose.ui.text.style.LineBreak;
/*      */ import androidx.compose.ui.text.style.LineHeightStyle;
/*      */ import androidx.compose.ui.text.style.TextAlign;
/*      */ import androidx.compose.ui.text.style.TextDecoration;
/*      */ import androidx.compose.ui.text.style.TextDirection;
/*      */ import androidx.compose.ui.text.style.TextForegroundStyle;
/*      */ import androidx.compose.ui.text.style.TextGeometricTransform;
/*      */ import androidx.compose.ui.text.style.TextIndent;
/*      */ import androidx.compose.ui.text.style.TextMotion;
/*      */ import androidx.compose.ui.unit.TextUnit;
/*      */ import kotlin.Deprecated;
/*      */ import kotlin.DeprecationLevel;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.jvm.JvmName;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000Â\001\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\020\007\n\002\bU\n\002\020\013\n\002\b\004\n\002\020\b\n\002\b\r\b\007\030\000 £\0012\0020\001:\002£\001B\027\b\020\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006BÕ\001\b\027\022\b\b\002\020\007\032\0020\b\022\b\b\002\020\t\032\0020\n\022\n\b\002\020\013\032\004\030\0010\f\022\n\b\002\020\r\032\004\030\0010\016\022\n\b\002\020\017\032\004\030\0010\020\022\n\b\002\020\021\032\004\030\0010\022\022\n\b\002\020\023\032\004\030\0010\024\022\b\b\002\020\025\032\0020\n\022\n\b\002\020\026\032\004\030\0010\027\022\n\b\002\020\030\032\004\030\0010\031\022\n\b\002\020\032\032\004\030\0010\033\022\b\b\002\020\034\032\0020\b\022\n\b\002\020\035\032\004\030\0010\036\022\n\b\002\020\037\032\004\030\0010 \022\n\b\002\020!\032\004\030\0010\"\022\n\b\002\020#\032\004\030\0010$\022\b\b\002\020%\032\0020\n\022\n\b\002\020&\032\004\030\0010'¢\006\002\020(Bí\001\b\027\022\b\b\002\020\007\032\0020\b\022\b\b\002\020\t\032\0020\n\022\n\b\002\020\013\032\004\030\0010\f\022\n\b\002\020\r\032\004\030\0010\016\022\n\b\002\020\017\032\004\030\0010\020\022\n\b\002\020\021\032\004\030\0010\022\022\n\b\002\020\023\032\004\030\0010\024\022\b\b\002\020\025\032\0020\n\022\n\b\002\020\026\032\004\030\0010\027\022\n\b\002\020\030\032\004\030\0010\031\022\n\b\002\020\032\032\004\030\0010\033\022\b\b\002\020\034\032\0020\b\022\n\b\002\020\035\032\004\030\0010\036\022\n\b\002\020\037\032\004\030\0010 \022\n\b\002\020!\032\004\030\0010\"\022\n\b\002\020#\032\004\030\0010$\022\b\b\002\020%\032\0020\n\022\n\b\002\020&\032\004\030\0010'\022\n\b\002\020)\032\004\030\0010*\022\n\b\002\020+\032\004\030\0010,¢\006\002\020-B\002\b\027\022\b\b\002\020\007\032\0020\b\022\b\b\002\020\t\032\0020\n\022\n\b\002\020\013\032\004\030\0010\f\022\n\b\002\020\r\032\004\030\0010\016\022\n\b\002\020\017\032\004\030\0010\020\022\n\b\002\020\021\032\004\030\0010\022\022\n\b\002\020\023\032\004\030\0010\024\022\b\b\002\020\025\032\0020\n\022\n\b\002\020\026\032\004\030\0010\027\022\n\b\002\020\030\032\004\030\0010\031\022\n\b\002\020\032\032\004\030\0010\033\022\b\b\002\020\034\032\0020\b\022\n\b\002\020\035\032\004\030\0010\036\022\n\b\002\020\037\032\004\030\0010 \022\n\b\002\020!\032\004\030\0010\"\022\n\b\002\020#\032\004\030\0010$\022\b\b\002\020%\032\0020\n\022\n\b\002\020&\032\004\030\0010'\022\n\b\002\020)\032\004\030\0010*\022\n\b\002\020+\032\004\030\0010,\022\n\b\002\020.\032\004\030\0010/\022\n\b\002\0200\032\004\030\00101¢\006\002\0202B\002\b\027\022\b\b\002\020\007\032\0020\b\022\b\b\002\020\t\032\0020\n\022\n\b\002\020\013\032\004\030\0010\f\022\n\b\002\020\r\032\004\030\0010\016\022\n\b\002\020\017\032\004\030\0010\020\022\n\b\002\020\021\032\004\030\0010\022\022\n\b\002\020\023\032\004\030\0010\024\022\b\b\002\020\025\032\0020\n\022\n\b\002\020\026\032\004\030\0010\027\022\n\b\002\020\030\032\004\030\0010\031\022\n\b\002\020\032\032\004\030\0010\033\022\b\b\002\020\034\032\0020\b\022\n\b\002\020\035\032\004\030\0010\036\022\n\b\002\020\037\032\004\030\0010 \022\n\b\002\0203\032\004\030\00104\022\n\b\002\020!\032\004\030\0010\"\022\n\b\002\020#\032\004\030\0010$\022\b\b\002\020%\032\0020\n\022\n\b\002\020&\032\004\030\0010'\022\n\b\002\020)\032\004\030\0010*\022\n\b\002\020+\032\004\030\0010,\022\n\b\002\020.\032\004\030\0010/\022\n\b\002\0200\032\004\030\00101\022\n\b\002\0205\032\004\030\00106¢\006\002\0207B\002\b\026\022\b\b\002\020\007\032\0020\b\022\b\b\002\020\t\032\0020\n\022\n\b\002\020\013\032\004\030\0010\f\022\n\b\002\020\r\032\004\030\0010\016\022\n\b\002\020\017\032\004\030\0010\020\022\n\b\002\020\021\032\004\030\0010\022\022\n\b\002\020\023\032\004\030\0010\024\022\b\b\002\020\025\032\0020\n\022\n\b\002\020\026\032\004\030\0010\027\022\n\b\002\020\030\032\004\030\0010\031\022\n\b\002\020\032\032\004\030\0010\033\022\b\b\002\020\034\032\0020\b\022\n\b\002\020\035\032\004\030\0010\036\022\n\b\002\020\037\032\004\030\0010 \022\n\b\002\0203\032\004\030\00104\022\b\b\002\020!\032\0020\"\022\b\b\002\020#\032\0020$\022\b\b\002\020%\032\0020\n\022\n\b\002\020&\032\004\030\0010'\022\n\b\002\020)\032\004\030\0010*\022\n\b\002\020+\032\004\030\0010,\022\b\b\002\020.\032\0020/\022\b\b\002\0200\032\00201\022\n\b\002\0205\032\004\030\00106¢\006\002\0208B\002\b\026\022\b\0209\032\004\030\0010:\022\b\b\002\020;\032\0020<\022\b\b\002\020\t\032\0020\n\022\n\b\002\020\013\032\004\030\0010\f\022\n\b\002\020\r\032\004\030\0010\016\022\n\b\002\020\017\032\004\030\0010\020\022\n\b\002\020\021\032\004\030\0010\022\022\n\b\002\020\023\032\004\030\0010\024\022\b\b\002\020\025\032\0020\n\022\n\b\002\020\026\032\004\030\0010\027\022\n\b\002\020\030\032\004\030\0010\031\022\n\b\002\020\032\032\004\030\0010\033\022\b\b\002\020\034\032\0020\b\022\n\b\002\020\035\032\004\030\0010\036\022\n\b\002\020\037\032\004\030\0010 \022\n\b\002\0203\032\004\030\00104\022\b\b\002\020!\032\0020\"\022\b\b\002\020#\032\0020$\022\b\b\002\020%\032\0020\n\022\n\b\002\020&\032\004\030\0010'\022\n\b\002\020)\032\004\030\0010*\022\n\b\002\020+\032\004\030\0010,\022\b\b\002\020.\032\0020/\022\b\b\002\0200\032\00201\022\n\b\002\0205\032\004\030\00106¢\006\002\020=B§\002\b\027\022\b\0209\032\004\030\0010:\022\b\b\002\020;\032\0020<\022\b\b\002\020\t\032\0020\n\022\n\b\002\020\013\032\004\030\0010\f\022\n\b\002\020\r\032\004\030\0010\016\022\n\b\002\020\017\032\004\030\0010\020\022\n\b\002\020\021\032\004\030\0010\022\022\n\b\002\020\023\032\004\030\0010\024\022\b\b\002\020\025\032\0020\n\022\n\b\002\020\026\032\004\030\0010\027\022\n\b\002\020\030\032\004\030\0010\031\022\n\b\002\020\032\032\004\030\0010\033\022\b\b\002\020\034\032\0020\b\022\n\b\002\020\035\032\004\030\0010\036\022\n\b\002\020\037\032\004\030\0010 \022\n\b\002\0203\032\004\030\00104\022\n\b\002\020!\032\004\030\0010\"\022\n\b\002\020#\032\004\030\0010$\022\b\b\002\020%\032\0020\n\022\n\b\002\020&\032\004\030\0010'\022\n\b\002\020)\032\004\030\0010*\022\n\b\002\020+\032\004\030\0010,\022\n\b\002\020.\032\004\030\0010/\022\n\b\002\0200\032\004\030\00101\022\n\b\002\0205\032\004\030\00106¢\006\002\020>B#\b\000\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\n\b\002\020)\032\004\030\0010*¢\006\002\020?J«\002\020\001\032\0020\0002\b\0209\032\004\030\0010:2\b\b\002\020;\032\0020<2\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\b\b\002\020\025\032\0020\n2\n\b\002\020\026\032\004\030\0010\0272\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\0332\b\b\002\020\034\032\0020\b2\n\b\002\020\035\032\004\030\0010\0362\n\b\002\020\037\032\004\030\0010 2\n\b\002\0203\032\004\030\001042\b\b\002\020!\032\0020\"2\b\b\002\020#\032\0020$2\b\b\002\020%\032\0020\n2\n\b\002\020&\032\004\030\0010'2\n\b\002\020)\032\004\030\0010*2\n\b\002\020+\032\004\030\0010,2\b\b\002\020.\032\0020/2\b\b\002\0200\032\002012\n\b\002\0205\032\004\030\00106ø\001\000¢\006\006\b\001\020\001Jµ\002\020\001\032\0020\0002\b\0209\032\004\030\0010:2\b\b\002\020;\032\0020<2\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\b\b\002\020\025\032\0020\n2\n\b\002\020\026\032\004\030\0010\0272\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\0332\b\b\002\020\034\032\0020\b2\n\b\002\020\035\032\004\030\0010\0362\n\b\002\020\037\032\004\030\0010 2\n\b\002\0203\032\004\030\001042\n\b\002\020!\032\004\030\0010\"2\n\b\002\020#\032\004\030\0010$2\b\b\002\020%\032\0020\n2\n\b\002\020&\032\004\030\0010'2\n\b\002\020)\032\004\030\0010*2\n\b\002\020+\032\004\030\0010,2\n\b\002\020.\032\004\030\0010/2\n\b\002\0200\032\004\030\001012\n\b\002\0205\032\004\030\00106H\007ø\001\000¢\006\006\b\001\020\001J¡\002\020\001\032\0020\0002\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\b\b\002\020\025\032\0020\n2\n\b\002\020\026\032\004\030\0010\0272\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\0332\b\b\002\020\034\032\0020\b2\n\b\002\020\035\032\004\030\0010\0362\n\b\002\020\037\032\004\030\0010 2\n\b\002\0203\032\004\030\001042\b\b\002\020!\032\0020\"2\b\b\002\020#\032\0020$2\b\b\002\020%\032\0020\n2\n\b\002\020&\032\004\030\0010'2\n\b\002\020)\032\004\030\0010*2\n\b\002\020+\032\004\030\0010,2\b\b\002\020.\032\0020/2\b\b\002\0200\032\002012\n\b\002\0205\032\004\030\00106ø\001\000¢\006\006\b\001\020\001J«\002\020\001\032\0020\0002\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\b\b\002\020\025\032\0020\n2\n\b\002\020\026\032\004\030\0010\0272\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\0332\b\b\002\020\034\032\0020\b2\n\b\002\020\035\032\004\030\0010\0362\n\b\002\020\037\032\004\030\0010 2\n\b\002\0203\032\004\030\001042\n\b\002\020!\032\004\030\0010\"2\n\b\002\020#\032\004\030\0010$2\b\b\002\020%\032\0020\n2\n\b\002\020&\032\004\030\0010'2\n\b\002\020)\032\004\030\0010*2\n\b\002\020+\032\004\030\0010,2\n\b\002\020.\032\004\030\0010/2\n\b\002\0200\032\004\030\001012\n\b\002\0205\032\004\030\00106H\007ø\001\000¢\006\006\b\001\020\001Jã\001\020\001\032\0020\0002\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\b\b\002\020\025\032\0020\n2\n\b\002\020\026\032\004\030\0010\0272\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\0332\b\b\002\020\034\032\0020\b2\n\b\002\020\035\032\004\030\0010\0362\n\b\002\020\037\032\004\030\0010 2\n\b\002\020!\032\004\030\0010\"2\n\b\002\020#\032\004\030\0010$2\b\b\002\020%\032\0020\n2\n\b\002\020&\032\004\030\0010'H\007ø\001\000¢\006\006\b\001\020\001Jû\001\020\001\032\0020\0002\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\b\b\002\020\025\032\0020\n2\n\b\002\020\026\032\004\030\0010\0272\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\0332\b\b\002\020\034\032\0020\b2\n\b\002\020\035\032\004\030\0010\0362\n\b\002\020\037\032\004\030\0010 2\n\b\002\020!\032\004\030\0010\"2\n\b\002\020#\032\004\030\0010$2\b\b\002\020%\032\0020\n2\n\b\002\020&\032\004\030\0010'2\n\b\002\020)\032\004\030\0010*2\n\b\002\020+\032\004\030\0010,H\007ø\001\000¢\006\006\b\001\020\001J\002\020\001\032\0020\0002\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\b\b\002\020\025\032\0020\n2\n\b\002\020\026\032\004\030\0010\0272\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\0332\b\b\002\020\034\032\0020\b2\n\b\002\020\035\032\004\030\0010\0362\n\b\002\020\037\032\004\030\0010 2\n\b\002\020!\032\004\030\0010\"2\n\b\002\020#\032\004\030\0010$2\b\b\002\020%\032\0020\n2\n\b\002\020&\032\004\030\0010'2\n\b\002\020)\032\004\030\0010*2\n\b\002\020+\032\004\030\0010,2\n\b\002\020.\032\004\030\0010/2\n\b\002\0200\032\004\030\00101H\007ø\001\000¢\006\006\b\001\020\001J\026\020\001\032\0030\0012\t\020\001\032\004\030\0010\001H\002J\021\020\001\032\0030\0012\007\020\001\032\0020\000J\021\020\001\032\0030\0012\007\020\001\032\0020\000J\n\020\001\032\0030\001H\026J\020\020\001\032\0030\001H\000¢\006\003\b\001J£\002\020\001\032\0020\0002\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\b\b\002\020\025\032\0020\n2\n\b\002\020\026\032\004\030\0010\0272\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\0332\b\b\002\020\034\032\0020\b2\n\b\002\020\035\032\004\030\0010\0362\n\b\002\020\037\032\004\030\0010 2\n\b\002\0203\032\004\030\001042\b\b\002\020!\032\0020\"2\b\b\002\020#\032\0020$2\b\b\002\020%\032\0020\n2\n\b\002\020&\032\004\030\0010'2\n\b\002\020+\032\004\030\0010,2\b\b\002\020.\032\0020/2\b\b\002\0200\032\002012\n\b\002\020)\032\004\030\0010*2\n\b\002\0205\032\004\030\00106H\007ø\001\000¢\006\006\b\001\020\001J«\002\020\001\032\0020\0002\b\b\002\020\007\032\0020\b2\b\b\002\020\t\032\0020\n2\n\b\002\020\013\032\004\030\0010\f2\n\b\002\020\r\032\004\030\0010\0162\n\b\002\020\017\032\004\030\0010\0202\n\b\002\020\021\032\004\030\0010\0222\n\b\002\020\023\032\004\030\0010\0242\b\b\002\020\025\032\0020\n2\n\b\002\020\026\032\004\030\0010\0272\n\b\002\020\030\032\004\030\0010\0312\n\b\002\020\032\032\004\030\0010\0332\b\b\002\020\034\032\0020\b2\n\b\002\020\035\032\004\030\0010\0362\n\b\002\020\037\032\004\030\0010 2\n\b\002\0203\032\004\030\001042\n\b\002\020!\032\004\030\0010\"2\n\b\002\020#\032\004\030\0010$2\b\b\002\020%\032\0020\n2\n\b\002\020&\032\004\030\0010'2\n\b\002\020+\032\004\030\0010,2\n\b\002\020.\032\004\030\0010/2\n\b\002\0200\032\004\030\001012\n\b\002\020)\032\004\030\0010*2\n\b\002\0205\032\004\030\00106H\007ø\001\000¢\006\006\b\001\020\001J\022\020\001\032\0020\0002\007\020\001\032\0020\005H\007J\022\020\001\032\0020\0002\007\020\001\032\0020\003H\007J\026\020\001\032\0020\0002\013\b\002\020\001\032\004\030\0010\000H\007J\023\020\001\032\0020\0002\007\020\001\032\0020\005H\002J\023\020\001\032\0020\0002\007\020\001\032\0020\003H\002J\023\020\001\032\0020\0002\007\020\001\032\0020\000H\002J\t\020 \001\032\0020\005H\007J\t\020¡\001\032\0020\003H\007J\t\020¢\001\032\0020\024H\026R\021\020;\032\0020<8F¢\006\006\032\004\b@\020AR\027\020\034\032\0020\b8Fø\001\000ø\001\001¢\006\006\032\004\bB\020CR\031\020\026\032\004\030\0010\0278Fø\001\000ø\001\001¢\006\006\032\004\bD\020ER\023\0209\032\004\030\0010:8F¢\006\006\032\004\bF\020GR\027\020\007\032\0020\b8Fø\001\000ø\001\001¢\006\006\032\004\bH\020CR\"\020I\032\004\030\001018GX\004ø\001\000ø\001\001¢\006\f\022\004\bJ\020K\032\004\bL\020MR\"\020N\032\004\030\0010/8GX\004ø\001\000ø\001\001¢\006\f\022\004\bO\020K\032\004\bP\020QR\"\020R\032\004\030\0010\"8GX\004ø\001\000ø\001\001¢\006\f\022\004\bS\020K\032\004\bT\020UR\"\020V\032\004\030\0010$8GX\004ø\001\000ø\001\001¢\006\f\022\004\bW\020K\032\004\bX\020YR\023\0203\032\004\030\001048F¢\006\006\032\004\bZ\020[R\023\020\021\032\004\030\0010\0228F¢\006\006\032\004\b\\\020]R\023\020\023\032\004\030\0010\0248F¢\006\006\032\004\b^\020_R\027\020\t\032\0020\n8Fø\001\000ø\001\001¢\006\006\032\004\b`\020CR\031\020\r\032\004\030\0010\0168Fø\001\000ø\001\001¢\006\006\032\004\ba\020bR\031\020\017\032\004\030\0010\0208Fø\001\000ø\001\001¢\006\006\032\004\bc\020dR\023\020\013\032\004\030\0010\f8F¢\006\006\032\004\be\020fR\027\0200\032\002018Fø\001\000ø\001\001¢\006\006\032\004\bg\020hR\027\020\025\032\0020\n8Fø\001\000ø\001\001¢\006\006\032\004\bi\020CR\027\020.\032\0020/8Fø\001\000ø\001\001¢\006\006\032\004\bj\020hR\027\020%\032\0020\n8Fø\001\000ø\001\001¢\006\006\032\004\bk\020CR\023\020+\032\004\030\0010,8F¢\006\006\032\004\bl\020mR\023\020\032\032\004\030\0010\0338F¢\006\006\032\004\bn\020oR\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\bp\020qR\023\020)\032\004\030\0010*¢\006\b\n\000\032\004\br\020sR\023\020\037\032\004\030\0010 8F¢\006\006\032\004\bt\020uR\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\bv\020wR\027\020!\032\0020\"8Fø\001\000ø\001\001¢\006\006\032\004\bx\020hR\023\020\035\032\004\030\0010\0368F¢\006\006\032\004\by\020zR\027\020#\032\0020$8Fø\001\000ø\001\001¢\006\006\032\004\b{\020hR\023\020\030\032\004\030\0010\0318F¢\006\006\032\004\b|\020}R\023\020&\032\004\030\0010'8F¢\006\006\032\004\b~\020R\025\0205\032\004\030\001068F¢\006\b\032\006\b\001\020\001\002\013\n\005\b¡\0360\001\n\002\b!¨\006¤\001"}, d2 = {"Landroidx/compose/ui/text/TextStyle;", "", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "paragraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;)V", "color", "Landroidx/compose/ui/graphics/Color;", "fontSize", "Landroidx/compose/ui/unit/TextUnit;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontFeatureSettings", "", "letterSpacing", "baselineShift", "Landroidx/compose/ui/text/style/BaselineShift;", "textGeometricTransform", "Landroidx/compose/ui/text/style/TextGeometricTransform;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "background", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "platformStyle", "Landroidx/compose/ui/text/PlatformTextStyle;", "lineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "lineBreak", "Landroidx/compose/ui/text/style/LineBreak;", "hyphens", "Landroidx/compose/ui/text/style/Hyphens;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "textMotion", "Landroidx/compose/ui/text/style/TextMotion;", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "brush", "Landroidx/compose/ui/graphics/Brush;", "alpha", "", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(Landroidx/compose/ui/text/SpanStyle;Landroidx/compose/ui/text/ParagraphStyle;Landroidx/compose/ui/text/PlatformTextStyle;)V", "getAlpha", "()F", "getBackground-0d7_KjU", "()J", "getBaselineShift-5SSeXJ0", "()Landroidx/compose/ui/text/style/BaselineShift;", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "getColor-0d7_KjU", "deprecated_boxing_hyphens", "getHyphens-EaSxIns$annotations", "()V", "getHyphens-EaSxIns", "()Landroidx/compose/ui/text/style/Hyphens;", "deprecated_boxing_lineBreak", "getLineBreak-LgCVezo$annotations", "getLineBreak-LgCVezo", "()Landroidx/compose/ui/text/style/LineBreak;", "deprecated_boxing_textAlign", "getTextAlign-buA522U$annotations", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "deprecated_boxing_textDirection", "getTextDirection-mmuk1to$annotations", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getDrawStyle", "()Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontFeatureSettings", "()Ljava/lang/String;", "getFontSize-XSAIIZE", "getFontStyle-4Lr2A7w", "()Landroidx/compose/ui/text/font/FontStyle;", "getFontSynthesis-ZQGJjVo", "()Landroidx/compose/ui/text/font/FontSynthesis;", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "getHyphens-vmbZdU8", "()I", "getLetterSpacing-XSAIIZE", "getLineBreak-rAG3T2k", "getLineHeight-XSAIIZE", "getLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "getLocaleList", "()Landroidx/compose/ui/text/intl/LocaleList;", "getParagraphStyle$ui_text", "()Landroidx/compose/ui/text/ParagraphStyle;", "getPlatformStyle", "()Landroidx/compose/ui/text/PlatformTextStyle;", "getShadow", "()Landroidx/compose/ui/graphics/Shadow;", "getSpanStyle$ui_text", "()Landroidx/compose/ui/text/SpanStyle;", "getTextAlign-e0LSkKk", "getTextDecoration", "()Landroidx/compose/ui/text/style/TextDecoration;", "getTextDirection-s_7X-co", "getTextGeometricTransform", "()Landroidx/compose/ui/text/style/TextGeometricTransform;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "getTextMotion", "()Landroidx/compose/ui/text/style/TextMotion;", "copy", "copy-Ns73l9s", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-aIRg9q4", "(Landroidx/compose/ui/graphics/Brush;FJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-p1EtxEg", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-v2rsoow", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "copy-HL5avdY", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/TextStyle;", "copy-NOaFTUo", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;)Landroidx/compose/ui/text/TextStyle;", "copy-CXVQc50", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;)Landroidx/compose/ui/text/TextStyle;", "equals", "", "other", "hasSameDrawAffectingAttributes", "hasSameLayoutAffectingAttributes", "hashCode", "", "hashCodeLayoutAffectingAttributes", "hashCodeLayoutAffectingAttributes$ui_text", "merge", "merge-dA7vx0o", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;IIJLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/LineHeightStyle;IILandroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "merge-Z1GrekI", "(JJLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontStyle;Landroidx/compose/ui/text/font/FontSynthesis;Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;JLandroidx/compose/ui/text/style/BaselineShift;Landroidx/compose/ui/text/style/TextGeometricTransform;Landroidx/compose/ui/text/intl/LocaleList;JLandroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/graphics/drawscope/DrawStyle;Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Landroidx/compose/ui/text/style/LineHeightStyle;Landroidx/compose/ui/text/style/LineBreak;Landroidx/compose/ui/text/style/Hyphens;Landroidx/compose/ui/text/PlatformTextStyle;Landroidx/compose/ui/text/style/TextMotion;)Landroidx/compose/ui/text/TextStyle;", "plus", "toParagraphStyle", "toSpanStyle", "toString", "Companion", "ui-text"})
/*      */ @Immutable
/*      */ public final class TextStyle
/*      */ {
/*      */   @NotNull
/*      */   public final SpanStyle getSpanStyle$ui_text() {
/*      */     return this.spanStyle;
/*      */   }
/*      */   
/*      */   public TextStyle(@NotNull SpanStyle spanStyle, @NotNull ParagraphStyle paragraphStyle, @Nullable PlatformTextStyle platformStyle) {
/*   60 */     this.spanStyle = spanStyle;
/*   61 */     this.paragraphStyle = paragraphStyle;
/*   62 */     this.platformStyle = platformStyle; } @Nullable public final PlatformTextStyle getPlatformStyle() { return this.platformStyle; }
/*      */    @NotNull
/*      */   public final ParagraphStyle getParagraphStyle$ui_text() {
/*      */     return this.paragraphStyle;
/*      */   } public TextStyle(@NotNull SpanStyle spanStyle, @NotNull ParagraphStyle paragraphStyle) {
/*   67 */     this(
/*   68 */         spanStyle, 
/*   69 */         paragraphStyle, 
/*   70 */         TextStyleKt.access$createPlatformTextStyleInternal(
/*   71 */           spanStyle.getPlatformStyle(), 
/*   72 */           paragraphStyle.getPlatformStyle()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private TextStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent) {
/*  101 */     this(
/*  102 */         new SpanStyle(
/*  103 */           color, 
/*  104 */           fontSize, 
/*  105 */           fontWeight, 
/*  106 */           fontStyle, 
/*  107 */           fontSynthesis, 
/*  108 */           fontFamily, 
/*  109 */           fontFeatureSettings, 
/*  110 */           letterSpacing, 
/*  111 */           baselineShift, 
/*  112 */           textGeometricTransform, 
/*  113 */           localeList, 
/*  114 */           background, 
/*  115 */           textDecoration, 
/*  116 */           shadow, 
/*  117 */           null, 
/*  118 */           null, null), 
/*      */         
/*  120 */         new ParagraphStyle(
/*  121 */           (textAlign != null) ? textAlign.unbox-impl() : TextAlign.Companion.getUnspecified-e0LSkKk(), 
/*  122 */           (textDirection != null) ? textDirection.unbox-impl() : TextDirection.Companion.getUnspecified-s_7X-co(), 
/*  123 */           lineHeight, 
/*  124 */           textIndent, 
/*  125 */           null, 
/*  126 */           null, 
/*  127 */           LineBreak.Companion.getUnspecified-rAG3T2k(), 
/*  128 */           Hyphens.Companion.getUnspecified-vmbZdU8(), 
/*  129 */           null, null), 
/*      */         
/*  131 */         null);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private TextStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle) {
/*  161 */     this(
/*  162 */         new SpanStyle(
/*  163 */           color, 
/*  164 */           fontSize, 
/*  165 */           fontWeight, 
/*  166 */           fontStyle, 
/*  167 */           fontSynthesis, 
/*  168 */           fontFamily, 
/*  169 */           fontFeatureSettings, 
/*  170 */           letterSpacing, 
/*  171 */           baselineShift, 
/*  172 */           textGeometricTransform, 
/*  173 */           localeList, 
/*  174 */           background, 
/*  175 */           textDecoration, 
/*  176 */           shadow, 
/*  177 */           (platformStyle != null) ? platformStyle.getSpanStyle() : null, 
/*  178 */           null, null), 
/*      */         
/*  180 */         new ParagraphStyle(
/*  181 */           (textAlign != null) ? textAlign.unbox-impl() : TextAlign.Companion.getUnspecified-e0LSkKk(), 
/*  182 */           (textDirection != null) ? textDirection.unbox-impl() : TextDirection.Companion.getUnspecified-s_7X-co(), 
/*  183 */           lineHeight, 
/*  184 */           textIndent, 
/*  185 */           (platformStyle != null) ? platformStyle.getParagraphStyle() : null, 
/*  186 */           lineHeightStyle, 
/*  187 */           LineBreak.Companion.getUnspecified-rAG3T2k(), 
/*  188 */           Hyphens.Companion.getUnspecified-vmbZdU8(), 
/*  189 */           null, null), 
/*      */         
/*  191 */         platformStyle);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private TextStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens) {
/*  260 */     this(
/*  261 */         new SpanStyle(
/*  262 */           color, 
/*  263 */           fontSize, 
/*  264 */           fontWeight, 
/*  265 */           fontStyle, 
/*  266 */           fontSynthesis, 
/*  267 */           fontFamily, 
/*  268 */           fontFeatureSettings, 
/*  269 */           letterSpacing, 
/*  270 */           baselineShift, 
/*  271 */           textGeometricTransform, 
/*  272 */           localeList, 
/*  273 */           background, 
/*  274 */           textDecoration, 
/*  275 */           shadow, 
/*  276 */           (platformStyle != null) ? platformStyle.getSpanStyle() : null, null, 32768, null), 
/*      */         
/*  278 */         new ParagraphStyle(
/*  279 */           (textAlign != null) ? textAlign.unbox-impl() : TextAlign.Companion.getUnspecified-e0LSkKk(), 
/*  280 */           (textDirection != null) ? textDirection.unbox-impl() : TextDirection.Companion.getUnspecified-s_7X-co(), 
/*  281 */           lineHeight, 
/*  282 */           textIndent, 
/*  283 */           (platformStyle != null) ? platformStyle.getParagraphStyle() : null, 
/*  284 */           lineHeightStyle, 
/*  285 */           (lineBreak != null) ? lineBreak.unbox-impl() : LineBreak.Companion.getUnspecified-rAG3T2k(), 
/*  286 */           (hyphens != null) ? hyphens.unbox-impl() : Hyphens.Companion.getUnspecified-vmbZdU8(), null, 256, null), 
/*      */         
/*  288 */         platformStyle);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private TextStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
/*  321 */     this(
/*  322 */         new SpanStyle(
/*  323 */           color, 
/*  324 */           fontSize, 
/*  325 */           fontWeight, 
/*  326 */           fontStyle, 
/*  327 */           fontSynthesis, 
/*  328 */           fontFamily, 
/*  329 */           fontFeatureSettings, 
/*  330 */           letterSpacing, 
/*  331 */           baselineShift, 
/*  332 */           textGeometricTransform, 
/*  333 */           localeList, 
/*  334 */           background, 
/*  335 */           textDecoration, 
/*  336 */           shadow, 
/*  337 */           (platformStyle != null) ? platformStyle.getSpanStyle() : null, 
/*  338 */           drawStyle, null), 
/*      */         
/*  340 */         new ParagraphStyle(
/*  341 */           (textAlign != null) ? textAlign.unbox-impl() : TextAlign.Companion.getUnspecified-e0LSkKk(), 
/*  342 */           (textDirection != null) ? textDirection.unbox-impl() : TextDirection.Companion.getUnspecified-s_7X-co(), 
/*  343 */           lineHeight, 
/*  344 */           textIndent, 
/*  345 */           (platformStyle != null) ? platformStyle.getParagraphStyle() : null, 
/*  346 */           lineHeightStyle, 
/*  347 */           (lineBreak != null) ? lineBreak.unbox-impl() : LineBreak.Companion.getUnspecified-rAG3T2k(), 
/*  348 */           (hyphens != null) ? hyphens.unbox-impl() : Hyphens.Companion.getUnspecified-vmbZdU8(), 
/*  349 */           textMotion, null), 
/*      */         
/*  351 */         platformStyle);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private TextStyle(long color, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
/*  419 */     this(
/*  420 */         new SpanStyle(
/*  421 */           color, 
/*  422 */           fontSize, 
/*  423 */           fontWeight, 
/*  424 */           fontStyle, 
/*  425 */           fontSynthesis, 
/*  426 */           fontFamily, 
/*  427 */           fontFeatureSettings, 
/*  428 */           letterSpacing, 
/*  429 */           baselineShift, 
/*  430 */           textGeometricTransform, 
/*  431 */           localeList, 
/*  432 */           background, 
/*  433 */           textDecoration, 
/*  434 */           shadow, 
/*  435 */           (platformStyle != null) ? platformStyle.getSpanStyle() : null, 
/*  436 */           drawStyle, null), 
/*      */         
/*  438 */         new ParagraphStyle(
/*  439 */           textAlign, 
/*  440 */           textDirection, 
/*  441 */           lineHeight, 
/*  442 */           textIndent, 
/*  443 */           (platformStyle != null) ? platformStyle.getParagraphStyle() : null, 
/*  444 */           lineHeightStyle, 
/*  445 */           lineBreak, 
/*  446 */           hyphens, 
/*  447 */           textMotion, null), 
/*      */         
/*  449 */         platformStyle);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private TextStyle(Brush brush, float alpha, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, TextMotion textMotion) {
/*  521 */     this(
/*  522 */         new SpanStyle(
/*  523 */           brush, 
/*  524 */           alpha, 
/*  525 */           fontSize, 
/*  526 */           fontWeight, 
/*  527 */           fontStyle, 
/*  528 */           fontSynthesis, 
/*  529 */           fontFamily, 
/*  530 */           fontFeatureSettings, 
/*  531 */           letterSpacing, 
/*  532 */           baselineShift, 
/*  533 */           textGeometricTransform, 
/*  534 */           localeList, 
/*  535 */           background, 
/*  536 */           textDecoration, 
/*  537 */           shadow, 
/*  538 */           (platformStyle != null) ? platformStyle.getSpanStyle() : null, 
/*  539 */           drawStyle, null), 
/*      */         
/*  541 */         new ParagraphStyle(
/*  542 */           textAlign, 
/*  543 */           textDirection, 
/*  544 */           lineHeight, 
/*  545 */           textIndent, 
/*  546 */           (platformStyle != null) ? platformStyle.getParagraphStyle() : null, 
/*  547 */           lineHeightStyle, 
/*  548 */           lineBreak, 
/*  549 */           hyphens, 
/*  550 */           textMotion, null), 
/*      */         
/*  552 */         platformStyle);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   private TextStyle(Brush brush, float alpha, long fontSize, FontWeight fontWeight, FontStyle fontStyle, FontSynthesis fontSynthesis, FontFamily fontFamily, String fontFeatureSettings, long letterSpacing, BaselineShift baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, TextDecoration textDecoration, Shadow shadow, DrawStyle drawStyle, TextAlign textAlign, TextDirection textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, LineBreak lineBreak, Hyphens hyphens, TextMotion textMotion) {
/*  586 */     this(
/*  587 */         new SpanStyle(
/*  588 */           brush, 
/*  589 */           alpha, 
/*  590 */           fontSize, 
/*  591 */           fontWeight, 
/*  592 */           fontStyle, 
/*  593 */           fontSynthesis, 
/*  594 */           fontFamily, 
/*  595 */           fontFeatureSettings, 
/*  596 */           letterSpacing, 
/*  597 */           baselineShift, 
/*  598 */           textGeometricTransform, 
/*  599 */           localeList, 
/*  600 */           background, 
/*  601 */           textDecoration, 
/*  602 */           shadow, 
/*  603 */           (platformStyle != null) ? platformStyle.getSpanStyle() : null, 
/*  604 */           drawStyle, null), 
/*      */         
/*  606 */         new ParagraphStyle(
/*  607 */           (textAlign != null) ? textAlign.unbox-impl() : TextAlign.Companion.getUnspecified-e0LSkKk(), 
/*  608 */           (textDirection != null) ? textDirection.unbox-impl() : TextDirection.Companion.getUnspecified-s_7X-co(), 
/*  609 */           lineHeight, 
/*  610 */           textIndent, 
/*  611 */           (platformStyle != null) ? platformStyle.getParagraphStyle() : null, 
/*  612 */           lineHeightStyle, 
/*  613 */           (lineBreak != null) ? lineBreak.unbox-impl() : LineBreak.Companion.getUnspecified-rAG3T2k(), 
/*  614 */           (hyphens != null) ? hyphens.unbox-impl() : Hyphens.Companion.getUnspecified-vmbZdU8(), 
/*  615 */           textMotion, null), 
/*      */         
/*  617 */         platformStyle);
/*      */   }
/*      */   @Stable
/*      */   @NotNull
/*  621 */   public final SpanStyle toSpanStyle() { return this.spanStyle; } @Stable
/*      */   @NotNull
/*      */   public final ParagraphStyle toParagraphStyle() {
/*  624 */     return this.paragraphStyle;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Stable
/*      */   @NotNull
/*      */   public final TextStyle merge(@Nullable TextStyle other) {
/*  637 */     if (other == null || Intrinsics.areEqual(other, Default)) return this; 
/*  638 */     return new TextStyle(
/*  639 */         toSpanStyle().merge(other.toSpanStyle()), 
/*  640 */         toParagraphStyle().merge(other.toParagraphStyle()));
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Stable
/*      */   @NotNull
/*      */   public final TextStyle merge-dA7vx0o(long color, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, @Nullable TextIndent textIndent, @Nullable LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, @Nullable PlatformTextStyle platformStyle, @Nullable TextMotion textMotion) {
/*  706 */     SpanStyle mergedSpanStyle = SpanStyleKt.fastMerge-dSHsh3o(this.spanStyle, 
/*  707 */         color, 
/*  708 */         null, 
/*  709 */         Float.NaN, 
/*  710 */         fontSize, 
/*  711 */         fontWeight, 
/*  712 */         fontStyle, 
/*  713 */         fontSynthesis, 
/*  714 */         fontFamily, 
/*  715 */         fontFeatureSettings, 
/*  716 */         letterSpacing, 
/*  717 */         baselineShift, 
/*  718 */         textGeometricTransform, 
/*  719 */         localeList, 
/*  720 */         background, 
/*  721 */         textDecoration, 
/*  722 */         shadow, 
/*  723 */         (platformStyle != null) ? platformStyle.getSpanStyle() : null, 
/*  724 */         drawStyle);
/*      */     
/*  726 */     ParagraphStyle mergedParagraphStyle = ParagraphStyleKt.fastMerge-j5T8yCg(this.paragraphStyle, 
/*  727 */         textAlign, 
/*  728 */         textDirection, 
/*  729 */         lineHeight, 
/*  730 */         textIndent, 
/*  731 */         (platformStyle != null) ? platformStyle.getParagraphStyle() : null, 
/*  732 */         lineHeightStyle, 
/*  733 */         lineBreak, 
/*  734 */         hyphens, 
/*  735 */         textMotion);
/*      */     
/*  737 */     if (this.spanStyle == mergedSpanStyle && this.paragraphStyle == mergedParagraphStyle) return this; 
/*  738 */     return new TextStyle(mergedSpanStyle, mergedParagraphStyle);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Stable
/*      */   @NotNull
/*      */   public final TextStyle merge(@NotNull SpanStyle other) {
/*  815 */     Intrinsics.checkNotNullParameter(other, "other"); return new TextStyle(
/*  816 */         toSpanStyle().merge(other), 
/*  817 */         toParagraphStyle());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Stable
/*      */   @NotNull
/*      */   public final TextStyle merge(@NotNull ParagraphStyle other) {
/*  828 */     Intrinsics.checkNotNullParameter(other, "other"); return new TextStyle(
/*  829 */         toSpanStyle(), 
/*  830 */         toParagraphStyle().merge(other));
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Stable
/*      */   @NotNull
/*      */   public final TextStyle plus(@NotNull TextStyle other) {
/*  838 */     Intrinsics.checkNotNullParameter(other, "other"); return merge(other);
/*      */   }
/*      */   
/*      */   @Stable
/*      */   @NotNull
/*      */   public final TextStyle plus(@NotNull ParagraphStyle other) {
/*  844 */     Intrinsics.checkNotNullParameter(other, "other"); return merge(other);
/*      */   }
/*      */   
/*      */   @Stable
/*      */   @NotNull
/*      */   public final TextStyle plus(@NotNull SpanStyle other) {
/*  850 */     Intrinsics.checkNotNullParameter(other, "other"); return merge(other);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final TextStyle copy-p1EtxEg(long color, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, @Nullable TextIndent textIndent, @Nullable PlatformTextStyle platformStyle, @Nullable LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, @Nullable TextMotion textMotion) {
/* 1145 */     return new TextStyle(
/* 1146 */         new SpanStyle(
/* 1147 */           Color.equals-impl0(color, this.spanStyle.getColor-0d7_KjU()) ? 
/* 1148 */           this.spanStyle.getTextForegroundStyle$ui_text() : 
/*      */           
/* 1150 */           TextForegroundStyle.Companion.from-8_81llA(color), 
/*      */           
/* 1152 */           fontSize, 
/* 1153 */           fontWeight, 
/* 1154 */           fontStyle, 
/* 1155 */           fontSynthesis, 
/* 1156 */           fontFamily, 
/* 1157 */           fontFeatureSettings, 
/* 1158 */           letterSpacing, 
/* 1159 */           baselineShift, 
/* 1160 */           textGeometricTransform, 
/* 1161 */           localeList, 
/* 1162 */           background, 
/* 1163 */           textDecoration, 
/* 1164 */           shadow, 
/* 1165 */           (platformStyle != null) ? platformStyle.getSpanStyle() : null, 
/* 1166 */           drawStyle, null), 
/*      */         
/* 1168 */         new ParagraphStyle(
/* 1169 */           textAlign, 
/* 1170 */           textDirection, 
/* 1171 */           lineHeight, 
/* 1172 */           textIndent, 
/* 1173 */           (platformStyle != null) ? platformStyle.getParagraphStyle() : null, 
/* 1174 */           lineHeightStyle, 
/* 1175 */           lineBreak, 
/* 1176 */           hyphens, 
/* 1177 */           textMotion, null), 
/*      */         
/* 1179 */         platformStyle);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @NotNull
/*      */   public final TextStyle copy-Ns73l9s(@Nullable Brush brush, float alpha, long fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @Nullable FontSynthesis fontSynthesis, @Nullable FontFamily fontFamily, @Nullable String fontFeatureSettings, long letterSpacing, @Nullable BaselineShift baselineShift, @Nullable TextGeometricTransform textGeometricTransform, @Nullable LocaleList localeList, long background, @Nullable TextDecoration textDecoration, @Nullable Shadow shadow, @Nullable DrawStyle drawStyle, int textAlign, int textDirection, long lineHeight, @Nullable TextIndent textIndent, @Nullable PlatformTextStyle platformStyle, @Nullable LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, @Nullable TextMotion textMotion) {
/* 1277 */     return new TextStyle(
/* 1278 */         new SpanStyle(
/* 1279 */           brush, 
/* 1280 */           alpha, 
/* 1281 */           fontSize, 
/* 1282 */           fontWeight, 
/* 1283 */           fontStyle, 
/* 1284 */           fontSynthesis, 
/* 1285 */           fontFamily, 
/* 1286 */           fontFeatureSettings, 
/* 1287 */           letterSpacing, 
/* 1288 */           baselineShift, 
/* 1289 */           textGeometricTransform, 
/* 1290 */           localeList, 
/* 1291 */           background, 
/* 1292 */           textDecoration, 
/* 1293 */           shadow, 
/* 1294 */           (platformStyle != null) ? platformStyle.getSpanStyle() : null, 
/* 1295 */           drawStyle, null), 
/*      */         
/* 1297 */         new ParagraphStyle(
/* 1298 */           textAlign, 
/* 1299 */           textDirection, 
/* 1300 */           lineHeight, 
/* 1301 */           textIndent, 
/* 1302 */           (platformStyle != null) ? platformStyle.getParagraphStyle() : null, 
/* 1303 */           lineHeightStyle, 
/* 1304 */           lineBreak, 
/* 1305 */           hyphens, 
/* 1306 */           textMotion, null), 
/*      */         
/* 1308 */         platformStyle);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final Brush getBrush() {
/* 1315 */     return this.spanStyle.getBrush();
/*      */   }
/*      */ 
/*      */   
/*      */   public final long getColor-0d7_KjU() {
/* 1320 */     return this.spanStyle.getColor-0d7_KjU();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final float getAlpha() {
/* 1326 */     return this.spanStyle.getAlpha();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final long getFontSize-XSAIIZE() {
/* 1332 */     return this.spanStyle.getFontSize-XSAIIZE();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final FontWeight getFontWeight() {
/* 1337 */     return this.spanStyle.getFontWeight();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final FontStyle getFontStyle-4Lr2A7w() {
/* 1342 */     return this.spanStyle.getFontStyle-4Lr2A7w();
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final FontSynthesis getFontSynthesis-ZQGJjVo() {
/* 1348 */     return this.spanStyle.getFontSynthesis-ZQGJjVo();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final FontFamily getFontFamily() {
/* 1353 */     return this.spanStyle.getFontFamily();
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final String getFontFeatureSettings() {
/* 1360 */     return this.spanStyle.getFontFeatureSettings();
/*      */   }
/*      */ 
/*      */   
/*      */   public final long getLetterSpacing-XSAIIZE() {
/* 1365 */     return this.spanStyle.getLetterSpacing-XSAIIZE();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final BaselineShift getBaselineShift-5SSeXJ0() {
/* 1370 */     return this.spanStyle.getBaselineShift-5SSeXJ0();
/*      */   }
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final TextGeometricTransform getTextGeometricTransform() {
/* 1376 */     return this.spanStyle.getTextGeometricTransform();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final LocaleList getLocaleList() {
/* 1381 */     return this.spanStyle.getLocaleList();
/*      */   }
/*      */ 
/*      */   
/*      */   public final long getBackground-0d7_KjU() {
/* 1386 */     return this.spanStyle.getBackground-0d7_KjU();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final TextDecoration getTextDecoration() {
/* 1391 */     return this.spanStyle.getTextDecoration();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final Shadow getShadow() {
/* 1396 */     return this.spanStyle.getShadow();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final DrawStyle getDrawStyle() {
/* 1401 */     return this.spanStyle.getDrawStyle();
/*      */   }
/*      */ 
/*      */   
/*      */   public final int getTextAlign-e0LSkKk() {
/* 1406 */     return this.paragraphStyle.getTextAlign-e0LSkKk();
/*      */   }
/*      */   @JvmName(name = "getTextAlign-buA522U")
/*      */   @Nullable
/*      */   public final TextAlign getTextAlign-buA522U() {
/* 1411 */     return TextAlign.box-impl(getTextAlign-e0LSkKk());
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getTextDirection-s_7X-co() {
/* 1418 */     return this.paragraphStyle.getTextDirection-s_7X-co();
/*      */   }
/*      */   @JvmName(name = "getTextDirection-mmuk1to")
/*      */   @Nullable
/*      */   public final TextDirection getTextDirection-mmuk1to() {
/* 1423 */     return TextDirection.box-impl(getTextDirection-s_7X-co());
/*      */   }
/*      */ 
/*      */   
/*      */   public final long getLineHeight-XSAIIZE() {
/* 1428 */     return this.paragraphStyle.getLineHeight-XSAIIZE();
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final TextIndent getTextIndent() {
/* 1433 */     return this.paragraphStyle.getTextIndent();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   @Nullable
/*      */   public final LineHeightStyle getLineHeightStyle() {
/* 1443 */     return this.paragraphStyle.getLineHeightStyle();
/*      */   }
/*      */ 
/*      */   
/*      */   public final int getHyphens-vmbZdU8() {
/* 1448 */     return this.paragraphStyle.getHyphens-vmbZdU8();
/*      */   }
/*      */   @JvmName(name = "getHyphens-EaSxIns")
/*      */   @Nullable
/*      */   public final Hyphens getHyphens-EaSxIns() {
/* 1453 */     return Hyphens.box-impl(getHyphens-vmbZdU8());
/*      */   }
/*      */ 
/*      */   
/*      */   public final int getLineBreak-rAG3T2k() {
/* 1458 */     return this.paragraphStyle.getLineBreak-rAG3T2k();
/*      */   }
/*      */   @JvmName(name = "getLineBreak-LgCVezo")
/*      */   @Nullable
/*      */   public final LineBreak getLineBreak-LgCVezo() {
/* 1463 */     return LineBreak.box-impl(getLineBreak-rAG3T2k());
/*      */   }
/*      */   
/*      */   @Nullable
/*      */   public final TextMotion getTextMotion() {
/* 1468 */     return this.paragraphStyle.getTextMotion();
/*      */   }
/*      */   public boolean equals(@Nullable Object other) {
/* 1471 */     if (this == other) return true; 
/* 1472 */     if (!(other instanceof TextStyle)) return false;
/*      */     
/* 1474 */     if (!Intrinsics.areEqual(this.spanStyle, ((TextStyle)other).spanStyle)) return false; 
/* 1475 */     if (!Intrinsics.areEqual(this.paragraphStyle, ((TextStyle)other).paragraphStyle)) return false; 
/* 1476 */     if (!Intrinsics.areEqual(this.platformStyle, ((TextStyle)other).platformStyle)) return false;
/*      */     
/* 1478 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean hasSameLayoutAffectingAttributes(@NotNull TextStyle other) {
/* 1495 */     Intrinsics.checkNotNullParameter(other, "other"); return (this == other || (Intrinsics.areEqual(this.paragraphStyle, other.paragraphStyle) && 
/* 1496 */       this.spanStyle.hasSameLayoutAffectingAttributes$ui_text(other.spanStyle)));
/*      */   }
/*      */   
/*      */   public final boolean hasSameDrawAffectingAttributes(@NotNull TextStyle other) {
/* 1500 */     Intrinsics.checkNotNullParameter(other, "other"); return (this == other || this.spanStyle.hasSameNonLayoutAttributes$ui_text(other.spanStyle));
/*      */   }
/*      */   
/*      */   public int hashCode() {
/* 1504 */     int result = this.spanStyle.hashCode();
/* 1505 */     result = 31 * result + this.paragraphStyle.hashCode();
/* 1506 */     result = 31 * result + ((this.platformStyle != null) ? this.platformStyle.hashCode() : 0);
/* 1507 */     return result;
/*      */   }
/*      */   
/*      */   public final int hashCodeLayoutAffectingAttributes$ui_text() {
/* 1511 */     int result = this.spanStyle.hashCodeLayoutAffectingAttributes$ui_text();
/* 1512 */     result = 31 * result + this.paragraphStyle.hashCode();
/* 1513 */     result = 31 * result + ((this.platformStyle != null) ? this.platformStyle.hashCode() : 0);
/* 1514 */     return result;
/*      */   }
/*      */   @NotNull
/*      */   public String toString() {
/* 1518 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$toString_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-TextStyle$toString$1 = 0;
/* 1519 */     $this$toString_u24lambda_u240.append("TextStyle(");
/* 1520 */     $this$toString_u24lambda_u240.append("color=" + Color.toString-impl(getColor-0d7_KjU()) + ", ");
/* 1521 */     $this$toString_u24lambda_u240.append("brush=" + getBrush() + ", ");
/* 1522 */     $this$toString_u24lambda_u240.append("alpha=" + getAlpha() + ", ");
/* 1523 */     $this$toString_u24lambda_u240.append("fontSize=" + TextUnit.toString-impl(getFontSize-XSAIIZE()) + ", ");
/* 1524 */     $this$toString_u24lambda_u240.append("fontWeight=" + getFontWeight() + ", ");
/* 1525 */     $this$toString_u24lambda_u240.append("fontStyle=" + getFontStyle-4Lr2A7w() + ", ");
/* 1526 */     $this$toString_u24lambda_u240.append("fontSynthesis=" + getFontSynthesis-ZQGJjVo() + ", ");
/* 1527 */     $this$toString_u24lambda_u240.append("fontFamily=" + getFontFamily() + ", ");
/* 1528 */     $this$toString_u24lambda_u240.append("fontFeatureSettings=" + getFontFeatureSettings() + ", ");
/* 1529 */     $this$toString_u24lambda_u240.append("letterSpacing=" + TextUnit.toString-impl(getLetterSpacing-XSAIIZE()) + ", ");
/* 1530 */     $this$toString_u24lambda_u240.append("baselineShift=" + getBaselineShift-5SSeXJ0() + ", ");
/* 1531 */     $this$toString_u24lambda_u240.append("textGeometricTransform=" + getTextGeometricTransform() + ", ");
/* 1532 */     $this$toString_u24lambda_u240.append("localeList=" + getLocaleList() + ", ");
/* 1533 */     $this$toString_u24lambda_u240.append("background=" + Color.toString-impl(getBackground-0d7_KjU()) + ", ");
/* 1534 */     $this$toString_u24lambda_u240.append("textDecoration=" + getTextDecoration() + ", ");
/* 1535 */     $this$toString_u24lambda_u240.append("shadow=" + getShadow() + ", ");
/* 1536 */     $this$toString_u24lambda_u240.append("drawStyle=" + getDrawStyle() + ", ");
/* 1537 */     $this$toString_u24lambda_u240.append("textAlign=" + TextAlign.toString-impl(getTextAlign-e0LSkKk()) + ", ");
/* 1538 */     $this$toString_u24lambda_u240.append("textDirection=" + TextDirection.toString-impl(getTextDirection-s_7X-co()) + ", ");
/* 1539 */     $this$toString_u24lambda_u240.append("lineHeight=" + TextUnit.toString-impl(getLineHeight-XSAIIZE()) + ", ");
/* 1540 */     $this$toString_u24lambda_u240.append("textIndent=" + getTextIndent() + ", ");
/* 1541 */     $this$toString_u24lambda_u240.append("platformStyle=" + this.platformStyle + ", ");
/* 1542 */     $this$toString_u24lambda_u240.append("lineHeightStyle=" + getLineHeightStyle() + ", ");
/* 1543 */     $this$toString_u24lambda_u240.append("lineBreak=" + LineBreak.toString-impl(getLineBreak-rAG3T2k()) + ", ");
/* 1544 */     $this$toString_u24lambda_u240.append("hyphens=" + Hyphens.toString-impl(getHyphens-vmbZdU8()) + ", ");
/* 1545 */     $this$toString_u24lambda_u240.append("textMotion=" + getTextMotion());
/* 1546 */     $this$toString_u24lambda_u240.append(")");
/*      */     Intrinsics.checkNotNullExpressionValue(stringBuilder1.toString(), "toString(...)");
/*      */     return stringBuilder1.toString();
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\034\020\003\032\0020\0048\006X\004¢\006\016\n\000\022\004\b\005\020\002\032\004\b\006\020\007¨\006\b"}, d2 = {"Landroidx/compose/ui/text/TextStyle$Companion;", "", "()V", "Default", "Landroidx/compose/ui/text/TextStyle;", "getDefault$annotations", "getDefault", "()Landroidx/compose/ui/text/TextStyle;", "ui-text"})
/*      */   public static final class Companion { private Companion() {}
/*      */     
/*      */     @NotNull
/* 1555 */     public final TextStyle getDefault() { return TextStyle.Default; } } @NotNull public static final Companion Companion = new Companion(null); @NotNull private final SpanStyle spanStyle; @NotNull private static final TextStyle Default = new TextStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777215, null);
/*      */   @NotNull
/*      */   private final ParagraphStyle paragraphStyle;
/*      */   @Nullable
/*      */   private final PlatformTextStyle platformStyle;
/*      */   public static final int $stable;
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\TextStyle.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */